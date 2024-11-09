//compile time --->exception 
/*
 * method overide and problem solve not possible 
 */
import java.io.IOException;

class A {
    void show() throws IOException {
        System.out.println("A class");
    }
}

class B extends A {
    void show() throws Exception {
        System.out.println("B clas");
    }
}

public class ExceptionOverridingCase8 {
    public static void main(String[] args) {
        B p = new B();
        try {
            p.show();
        } catch (Exception ex) {

        }
    }
}
