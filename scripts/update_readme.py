import os

def generate_table():
    root_dir = "."
    rows = []
    
    # 1. Fetch LeetCode Folders (folders starting with numbers like 0001-two-sum)
    lc_folders = sorted([f for f in os.listdir(root_dir) if os.path.isdir(f) and f[:4].isdigit()])
    
    for folder in lc_folders:
        parts = folder.split("-")
        prob_id = parts[0]
        prob_title = " ".join(parts[1:]).title()
        
        java_file = None
        for f in os.listdir(os.path.join(root_dir, folder)):
            if f.endswith(".java"):
                java_file = f
                break
        
        if java_file:
            sol_link = f"[Java](./{folder}/{java_file})"
            notes_link = f"[Notes](./{folder}/README.md)"
            rows.append(f"| #{prob_id} | {prob_title} | LeetCode | {sol_link} | {notes_link} |")

    # 2. Fetch Topic-wise DSA files in src/dsa/
    dsa_dir = os.path.join("src", "dsa")
    if os.path.exists(dsa_dir):
        for root, _, files in os.walk(dsa_dir):
            for file in sorted(files):
                if file.endswith(".java"):
                    rel_path = os.path.relpath(os.path.join(root, file), root_dir).replace("\\", "/")
                    topic = os.path.basename(root).replace("_", " ").title()
                    prob_title = file.replace(".java", "").replace("_", " ").title()
                    sol_link = f"[Java](./{rel_path})"
                    rows.append(f"| DSA | {prob_title} | {topic} | {sol_link} | - |")
               
    table_header = "| ID/Type | Problem / Topic | Domain | Solution | Notes |\n|---|---|---|---|---|\n"
    return table_header + "\n".join(rows)

def update_readme():
    table_content = generate_table()
    if not os.path.exists("README.md"):
        return

    with open("README.md", "r", encoding="utf-8") as f:
        content = f.read()
        
    start_marker = "<!-- LEETCODE_SOLUTIONS_START -->"
    end_marker = "<!-- LEETCODE_SOLUTIONS_END -->"
    
    if start_marker in content and end_marker in content:
        new_content = (
            content.split(start_marker)[0] 
            + start_marker 
            + "\n\n" 
            + table_content 
            + "\n\n" 
            + end_marker 
            + content.split(end_marker)[1]
        )
        with open("README.md", "w", encoding="utf-8") as f:
            f.write(new_content)

if __name__ == "__main__":
    update_readme()
