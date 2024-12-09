import java.util.*;

public class ArrayListCreationPart {
    public static void main(String[] args) {
        // iterable -- collection -- list --- arraylist
        List<Integer> al1 = new ArrayList<>();
        al1.add(2);
        al1.add(4);
        al1.add(8);
        System.out.println(al1);

        Collection<Integer> al2 = new ArrayList<>();
        al2.add(45);
        al2.add(87);
        al2.add(12);
        al2.add(8);
        System.out.println(al2);

        Iterable al3 = new ArrayList<>();
        // no add method present in iterable interface
        // add method :collection and arraylist and list 
    }
}
