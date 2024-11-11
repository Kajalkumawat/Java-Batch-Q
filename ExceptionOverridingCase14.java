//runtime class -->throwable 
class A {
    void show() throws RuntimeException {
        System.out.println("A class");
    }
}

class B extends A {
    void show() throws Throwable {
        System.out.println("B class");
    }
}

public class ExceptionOverridingCase14 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}
