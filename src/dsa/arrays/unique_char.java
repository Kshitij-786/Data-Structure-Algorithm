package javaCollege;

public class unique_char {
    static void main(String[] args) {
        String str = "programing";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == i) {
                System.out.println(ch);

            }
        }
    }
}
