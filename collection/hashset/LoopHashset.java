import java.util.*;

public class LoopHashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("hiii");
        hs.add("byee");
        System.out.println(hs.size());
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        // does not used for loop :get method does not support
        // you should used for each
        for (String s : hs) {
            System.out.println(s);
        }
    }
}
