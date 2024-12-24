import  java.util.*;
public class LinkedHashMapBasic4 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhs=new LinkedHashMap<>();
        lhs.put(1,"hello");
        lhs.put(2, "bye");
        lhs.put(3,"tata");
        System.out.println(lhs.values());
        System.out.println(lhs.keySet());
        System.out.println(lhs.entrySet()); 
    }
}
