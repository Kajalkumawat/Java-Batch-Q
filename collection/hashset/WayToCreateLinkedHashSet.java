import java.util.*;

public class WayToCreateLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
        lhs1.add(1);
        System.out.println(lhs1);

        // through collection :
        Collection<Integer> lhs2 = new LinkedHashSet<>();
        lhs2.add(23);
        System.out.println(lhs2);

        // set :
        Set<Integer> lhs3 = new LinkedHashSet<>();
        lhs3.add(45);
        System.out.println(lhs3);

        // iterable
        Iterable<Integer> itr = new LinkedHashSet<>();

        // hashset :
        HashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(567);
        System.out.println(hs);
    }
}
