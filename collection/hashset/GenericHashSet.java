import java.util.*;

public class GenericHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(67);
        hs.add(34);
        hs.add(34);
        hs.add(89);
        hs.add(4);
        System.out.println(hs);
    }
}
