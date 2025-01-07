import java.util.*;

public class ArrayDequeBasic2 {
    public static void main(String[] args) {
        //array dequeue :impleneation queue 
        Queue<String> q=new ArrayDeque<>();
        q.add("hello");
        q.add("hii");
        System.out.println("qeueue "+q);
        //dequeue :implentation arraydqueue 
        Deque<Integer> dq=new ArrayDeque<>();
        dq.add(123);
        dq.add(67);
        System.out.println("dequeue "+dq);
        //collection :implenet 
        Collection<Integer> c=new ArrayDeque<>();
        c.add(67);
        c.add(12);
        c.add(89);
        System.out.println("collection "+c);

        //Abstract collection :implement 
        AbstractCollection<String> ab=new ArrayDeque<>();
        ab.add("kajal");
        ab.add("vishal");
        ab.add("abhishek");
        System.out.println("ab "+ab);
    }
}
