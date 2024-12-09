import java.util.*;

public class ArrayListListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        ListIterator litr1 = al.listIterator();
        while (litr1.hasNext()) {
            System.out.print(litr1.next() + " ");
        }

    }
}
