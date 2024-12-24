import java.util.LinkedHashMap;
import java.util.Map;

class A{
    int a;
    A(int a){
        this.a=a;
    }
}
public class LinkedHashMapBasic5 {
    public static void main(String[] args) {
       A p=new A(78); 
       A k=new A(34);
       LinkedHashMap<String,A> lhm=new LinkedHashMap<>();
       lhm.put("hello", p);
       lhm.put("hii", k);
       for(Map.Entry<String,A> hm:lhm.entrySet()){
        String s=hm.getKey();
        A l=hm.getValue();
        System.out.println(s+" "+l.a);
       }
    }
}
