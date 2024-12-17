import java.util.*;

public class LinedListPrint {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("hello");
        ll.add("hiii");
        ll.add("bye");
        System.out.println(ll);

        // size
        System.out.println(ll.size());
        // single element :get method
        System.out.println(ll.get(0));
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i));
        }
        System.out.println();
        // for each loop
        for (String i : ll) {
            System.out.print(i + " ");
        }
        System.out.println("iterator");
        Iterator itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        // list iterator
        ListIterator litr = ll.listIterator();
        while (litr.hasNext()) {
            System.out.print(litr.next() + " ");
        }
       // previous
        System.out.println();
        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }
    }
}
