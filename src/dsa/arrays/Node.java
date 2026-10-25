class Node{
    int data;
    int next;
    Node(int data){
        this.data=data;
        this.next= null;
    }
    public class linkeList{
        static void main(String[] args) {
            if(head == null|| head.next == null){
                return head;
            }
            Node s = head;
            Node f = head;
            while(f!=null && f.next!=null){
                s=s.next;
                f =f.next.next;
            }
            return s;

        }
    }
}