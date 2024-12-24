import java.util.*;
public class TreeMapBasic2 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(6, "hello");
        tm.put(3, "bye");
        tm.put(7, "hii");
        //for each loop 
        for(Map.Entry<Integer,String> hm:tm.entrySet()){
            System.out.println(hm.getKey()+" "+hm.getValue());
        }
    }
}
