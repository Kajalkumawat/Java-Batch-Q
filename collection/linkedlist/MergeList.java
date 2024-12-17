import java.util.*;

public class MergeList {
    public static void main(String[] args) {
        // first way
        // list1
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("hello");
        list1.add("bye");
        // list2
        LinkedList<String> list2 = new LinkedList<>(list1);
        list2.add("abhishek");
        list2.add("vishal");
        System.out.println(list2);

        // second
        LinkedList<String> list3 = new LinkedList<>();
        list3.add("kajal");
        list3.add("anjali");

        LinkedList<String> list4 = new LinkedList<>();
        list4.add("tushar");
        list4.add("ashish");
        list3.addAll(list4);
        System.out.println(list3);
    }
}
