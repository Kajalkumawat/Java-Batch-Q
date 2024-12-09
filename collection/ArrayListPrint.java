import java.util.*;

public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);

        System.out.println(al.size());

        System.out.println(al.get(3));
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        // reverse of the arraylist
        for (int i = al.size() - 1; i >= 0; i--) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        // for each loop
        for (int i : al) {
            System.out.print(i + " ");
        }
    }
}
