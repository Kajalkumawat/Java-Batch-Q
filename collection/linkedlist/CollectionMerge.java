import java.util.*;

public class CollectionMerge {
    public static void main(String[] args) {
        // linkedlist -----linkedlist
        // linkedlist--- arraylist
        LinkedList<String> ll = new LinkedList<>();
        ll.add("hello");
        ll.add("hii");
        ArrayList<String> al = new ArrayList<>(ll);
        al.add("vishal");
        al.add("abhishek");
        System.out.println(al);

        // al.addAll(ll);possible
        // arraylist--linkedlist
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("kajal");
        al1.add("pranchi");

        LinkedList<String> ll1 = new LinkedList<>(al1);
        ll1.add("tushar");
        ll1.add("ayushman");
        System.out.println(ll1);
    }
}
