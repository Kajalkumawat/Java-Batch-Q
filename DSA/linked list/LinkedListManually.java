public class LinkedListManually {
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
        //size method :
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.add(67);
        ll.add(78);
        ll.add(679);
        ll.display();
        System.out.println(ll.size());
    }
}
