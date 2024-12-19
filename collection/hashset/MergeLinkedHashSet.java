import java.util.*;

public class MergeLinkedHashSet {
    public static void main(String[] args) {
        // hashset ---linkedhashset
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(hs);
        lhs.add(1);
        lhs.add(2);
        System.out.println(lhs);
    }
}
