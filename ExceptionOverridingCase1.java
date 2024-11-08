
//runtime exception ----> compile time exception 
/*
 * parent class =>run time excpetio and extends child class have compile time then this problem is not solve through throw and try catch block 
 */
import java.io.IOException;

class A {
    void show() throws ArithmeticException {
        System.out.println("A class");
    }
}

class B extends A {
    void show() throws IOException {
        System.out.println("B class");

    }
}

public class ExceptionOverridingCase1 {
    public static void main(String[] args) {
        B p = new B();
        try {
            p.show();
        } catch (Exception ex) {

        }
    }
}
