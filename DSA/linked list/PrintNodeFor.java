public class PrintNodeFor {
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
        //two way :
        for(Node i=a;i!=null;i=i.next){
            System.out.print(i.value+" ");
        }
        System.out.println();
        Node temp=a;
        int size=5;
        for(int i=0;i<size;i++){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
        // for(Node i:a){
        //     System.out.println(i.value+" ");
        // }
    }
}
