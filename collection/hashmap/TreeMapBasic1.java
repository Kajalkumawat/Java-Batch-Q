import java.util.*;
public class TreeMapBasic1 {
    public static void main(String[] args) {
        TreeMap<Integer,String>  tm=new TreeMap<>();
        tm.put(1,"hello");
        tm.put(2,"hiii");
        tm.put(3, "bye");
        System.out.println(tm);
    }
}
