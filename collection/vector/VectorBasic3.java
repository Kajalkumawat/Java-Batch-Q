import java.util.*;

public class VectorBasic3 {
    public static void main(String[] args) {
          Vector<Integer> l=new Vector<>();
        l.add(34);
        l.add(12);
       Iterator<Integer> itr=l.iterator();
       while(itr.hasNext()){
        System.out.print(itr.next()+" ");
       }
    }
}
