import java.util.*;
public class HashMapForEach {
    public static void main(String[] args) {
       HashMap<Integer,String> hs=new HashMap<>();
       hs.put(1, "hello") ;
       hs.put(2, "hi");
       //Ma
       for(Map.Entry hm:hs.entrySet()){
        System.out.println(hm.getKey()+" "+hm.getValue());
       }
    }
}
