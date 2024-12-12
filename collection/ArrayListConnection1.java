import java.util.*;

public class ArrayListConnection1 {
    public static void main(String[] args) {
        // add one list to another list then it must be same wrapper class
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(3);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("hello");
        al2.add("bye");
        System.out.println(al2);

        al1.addAll(al2);
        System.out.println(al1);
    }
}
