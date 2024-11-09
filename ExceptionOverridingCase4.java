//exception ---> exception 
/*
 * method overide but problem of method overriding does not solve
 */
class A {
    void show() throws Exception {
        System.out.println("A class");
    }
}

class B {
    void show() throws Exception {
        System.out.println("B class");
    }
}

public class ExceptionOverridingCase4 {
    public static void main(String[] args) {
        B p = new B();
        try {
            p.show();
        } catch (Exception ex) {
        }
    }
}
