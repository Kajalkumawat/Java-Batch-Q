import java.util.*;

public class LinkedListCreation { 
    public static void main(String[] args) {
        Iterable itr = new LinkedList<>();
        Collection c = new LinkedList<>();
        c.add(45);
        System.out.println(c);
        List l = new LinkedList<>();
        l.add(67);
        System.out.println(l);
        LinkedList ll = new LinkedList<>();
        ll.add(45);
        System.out.println(ll);
    }
}