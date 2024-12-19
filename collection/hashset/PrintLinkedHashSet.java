import java.util.*;

public class PrintLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(4);
        lhs.add(5);
        System.out.println(lhs);

        for (Integer i : lhs) {
            System.out.print(i + " ");
        }
        System.out.println();
        Iterator itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
