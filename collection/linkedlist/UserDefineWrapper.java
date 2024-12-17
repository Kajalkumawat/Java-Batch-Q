import java.util.*;

class A {
    int a;
    String name;

    A(int a, String name) {
        this.a = a;
        this.name = name;
    }
}

public class UserDefineWrapper { 
    public static void main(String[] args) {
        A p1 = new A(23, "hii");
        A p2 = new A(67, "bye");
        LinkedList<A> ll = new LinkedList<>();
        ll.add(p1);
        ll.add(p2);
        for (A l : ll) {
            System.out.println(l.a + " " + l.name);
        }
    }
}
