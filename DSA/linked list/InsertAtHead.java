public class InsertAtHead {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    //linkedlist class 
    static class Linkedlist{
        //node
        Node head=null;
        Node tail=null;
        //temp node :data insert 
        void add(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
        }
        void insertAthead(int val){
            Node temp=new Node(val);
            //empty linkedlist 
            if(head==null){
                head=temp;
                tail=temp;
            }
            //non empty 
            else{
                temp.next=head;
                head=temp;
            }
        }
    }
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.display();
        System.out.println();
        ll.insertAthead(98);
        ll.display();
    }
}
