import java.util.*;
public class Implementation {
    public static void main(String[] args) {
        Map<Integer,String> m=new TreeMap<>();
        m.put(2,"hello");

        //sorted map :
        SortedMap<Integer,String> sm=new TreeMap<>();
        sm.put(45,"bye");

        //navigable map :
        NavigableMap<Integer,String> nm=new TreeMap<>();
        nm.put(12,"hiii");

        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(99,"tata");
    }
}
