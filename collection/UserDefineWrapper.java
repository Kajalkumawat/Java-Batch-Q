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
        //make generic class is user define 
        A p1=new A(34, "hello");
        A p2=new A(45, "bye");
        ArrayList<A> al=new ArrayList<>();
        al.add(p1);
        al.add(p2);
        for(A k:al){
            System.out.println(k.a+" "+k.name);
        } 
    }
}
