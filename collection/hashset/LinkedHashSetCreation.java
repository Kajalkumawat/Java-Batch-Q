import java.util.*;

public class LinkedHashSetCreation {
    public static void main(String[] args) {
        // hetrogenous data stored
        LinkedHashSet lhs1 = new LinkedHashSet<>();
        lhs1.add(34);
        lhs1.add("hello");
        lhs1.add(67.8);
        System.out.println(lhs1);

        // homohenous type of data
        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
        lhs2.add(1);
        lhs2.add(2);
        lhs2.add(3);
        System.out.println(lhs2);
    }
}