import java.util.*;

public class AggregationWrapper {
    public static void main(String[] args) {
        A p = new A(34, "hii");
        HashSet<A> hs = new HashSet<>();
        hs.add(p);
        for (A s : hs) {
            System.out.println(s.a + " " + s.name);
        }
    }
}
