import java.util.*;

public class VectorBasic1 {
    public static void main(String[] args) {
        // hetrogenous data stored :non-generic part 
        Vector v1 = new Vector<>();
        v1.addElement(78);
        v1.addElement("hello");
        System.out.println(v1);

        //homogenous data stored :generic part 
        Vector<String> v2=new Vector<>();
        v2.addElement("hello");
        v2.addElement("bye bye");
        System.out.println(v2);
    }
}