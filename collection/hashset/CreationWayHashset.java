import java.util.*;

public class CreationWayHashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        System.out.println(hs);

        Set<Integer> hs1 = new HashSet<>();
        hs1.add(78);
        System.out.println(hs1); 

        Collection hs2 = new HashSet<>();
        hs2.add("hello");
        System.out.println(hs2);

        Iterable it=new HashSet<>();
        //it.add(); not possible 
    }
}
