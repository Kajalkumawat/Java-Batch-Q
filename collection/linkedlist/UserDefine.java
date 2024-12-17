import java.util.*;

public class UserDefine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        LinkedList<String> ll = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            String s = sc.next();
            ll.add(s);
        }
        System.out.println(ll);
    }
}
