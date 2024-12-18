import java.lang.reflect.Array;
import java.util.*;

public class MergeHashSet {
    public static void main(String[] args) {
        // hashset ----hashset
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(34);

        HashSet<Integer> hs2 = new HashSet<>(hs1);
        hs2.add(78);
        // System.out.println(hs2);
        // linkedlist---hashset
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(78);
        ll.add(12);
        // System.out.println(ll);

        HashSet<Integer> hs3 = new HashSet<>(ll);
        hs3.add(120);
        hs3.add(89);
        hs3.add(78);
        // System.out.println(hs3);
        // arraylist---hs
        ArrayList<String> al = new ArrayList<>();
        al.add("hello");
        al.add("bye");
        al.add("hello");
        al.add("tata");

        HashSet<String> hs4 = new HashSet<>(al);
        hs4.add("hello");
        hs4.add("bye");
        hs4.add("hello");
        hs4.add("tata");
        // System.out.println(hs4);
        // hs---ll
        HashSet<Integer> hs5 = new HashSet<>();
        hs5.add(12);
        hs5.add(78);
        hs5.add(89);

        LinkedList<Integer> ll1 = new LinkedList<>(hs5);
        ll1.add(34);
        ll1.add(67);
        System.out.println(ll1);
        // hs---al
    }
}
