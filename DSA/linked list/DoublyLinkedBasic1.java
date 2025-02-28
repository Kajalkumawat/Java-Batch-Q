public class DoublyLinkedBasic1{
    static class Node{
        int data;
        Node next;
        Node previous;
        Node(int data){
            this.data=data;
        }
       
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    //print through tail 
    public static void displayTail(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.previous;
        }
    }
    //want to print :random c (a,b,c,d,e)
    public static void random(Node ran){
        Node temp=ran;
        while(temp.previous!=null){
            temp=temp.previous;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static  void main(String[] args){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        a.previous=null;
        b.next=c;
        b.previous=a;
        c.next=d;
        c.previous=b;
        d.next=e;
        d.previous=c;
        e.next=null;
        e.previous=d;
       // display(a);
      // displayTail(e);
      random(c);
    }
}