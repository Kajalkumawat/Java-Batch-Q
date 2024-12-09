import java.util.*;

public class ArrayListEven {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) % 2 == 0) {
                System.out.print(al.get(i) + " ");
            }
        }
    }
}
