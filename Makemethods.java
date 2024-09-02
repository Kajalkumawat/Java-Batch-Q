//make non abstract methods in interface 
interface A {
    // make non abstract method
    default void hello() {
        System.out.println("non abstract in interface");
    }
}

class B implements A {
    // code
}

public class Makemethods {
    public static void main(String[] args) {
        B k = new B();
        k.hello();
    }
}
