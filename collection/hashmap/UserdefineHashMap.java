import java.util.*;
class A{
    int a;
    A(int a){
        this.a=a;
    }
}
public class UserdefineHashMap{   
    public static void main(String[] args){
        A p=new A(45);
        HashMap<Integer,A> hs=new HashMap<>();
        hs.put(1,p);
        for(Map.Entry<Integer,A> hm:hs.entrySet()){
            A k=hm.getValue();
           System.out.println(hm.getKey()+" "+k.a);
        }
    }
}