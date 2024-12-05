import java.util.*;

public class ArrayListHetro {
    public static void main(String[] args) {
        // non -generic class
        ArrayList al = new ArrayList<>();
        al.add("hello ");
        al.add(678);
        al.add(7.32);
        al.add('y');
        System.out.println(al);
    }
}
