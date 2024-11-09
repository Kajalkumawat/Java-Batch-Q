//exception ---->run time 
/*
 * exception and run method overide and problem solve also 
 */
class A {
    void show() throws Exception {
        System.out.println("A class");
    }
}

class B extends A {
    void show() throws ArithmeticException {
        try {
            super.show();
        } catch (Exception ex) {

        }
        
        System.out.println("B class");
    }
}

public class ExceptionOverridingCase6 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}
