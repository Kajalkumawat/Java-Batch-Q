import java.util.*;

public class HashSetCreation {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        hs.add("hello");
        hs.add(67);
        hs.add('k');
        hs.add(67.5);
        System.out.println(hs);
    }
}