import java.util.*;
public class VectorBasic2 {
    public static void main(String[] args) {
        //implenentation 
        Collection<String> c=new Vector<>();
        c.add("hello");
        c.add("bye");

        System.out.println("collection "+c);

        List<Integer> l=new Vector<>();
        l.add(34);
        l.add(12);
        System.out.println("list "+l);
    }
}
