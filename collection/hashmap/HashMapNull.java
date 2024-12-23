import  java.util.*;
public class HashMapNull{
    public static void main(String[] args) {
        HashMap<Integer,String> hs=new HashMap<>();
        hs.put(null, "hello");
        hs.put(1, "bye");
        hs.put(null, "tata");
        hs.put(2, null);
        hs.put(5, null);
        System.out.println(hs);
    }
}