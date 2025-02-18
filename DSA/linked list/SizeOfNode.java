public class SizeOfNode{
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    //size find out 
    public static int size(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
      return count;
    }
    public static void main(String[] args){
        Node a=new Node(23);
        Node b=new Node(89);
        Node c=new Node(12);
        Node d=new Node(45);
        Node e=new Node(67);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        System.out.println(size(a));
    }
}