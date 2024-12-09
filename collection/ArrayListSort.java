import java.util.*;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(56);
        al.add(21);
        al.add(78);
        al.add(98);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}
