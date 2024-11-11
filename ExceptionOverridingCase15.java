//run time class --->runtime class  
class A {
    void show() throws RuntimeException {
        System.out.println("A class");
    }
}

class B extends A {
    void show() throws RuntimeException {
        super.show();
        System.out.println("B class");
    }
}

public class ExceptionOverridingCase15 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}
