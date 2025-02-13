public class PrintNodeWhile {
    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(12);
        Node b=new Node(23);
        Node c=new Node(78);
        Node d=new Node(88);
        Node e=new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e; 
        e.next=null;
        Node temp=a;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
}
