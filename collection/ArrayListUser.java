import java.util.*;

public class ArrayListUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int x = sc.nextInt();
            al.add(x);
        }
        for (int i : al) {
            System.out.print(i + " ");
        }
    }
}
