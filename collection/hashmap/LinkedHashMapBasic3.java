import java.util.*;
public class LinkedHashMapBasic3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhs=new LinkedHashMap<>();
        lhs.put(1,"hello");
        lhs.put(2, "bye");
        lhs.put(3,"tata");
        for(Map.Entry hm:lhs.entrySet()){
            System.out.println(hm.getKey()+" "+hm.getValue());
        }
    }
}
