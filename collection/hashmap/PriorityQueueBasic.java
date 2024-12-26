
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasic {
   public static void main(String[] args) {
    //queue :
    Queue q=new PriorityQueue<>();
    q.add("hello");
    q.add('u');
    q.add(23);
    System.out.println(q);
   }
}
