public class UpdateElement {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    static class Linkedlist{
        Node head=null;
        Node tail=null;
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
       void update(int index,int val){
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.val=val;
       }
    }
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.update(3, 0);
        ll.display();
    }
}
