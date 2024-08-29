//can we make non abstract method in abtraction : 
abstract class A {
    // non abstract method : define in abstract class
    // non abstract method :it is not restrict to used another class
    void show() {
        System.out.println("non abstract method");
    }
}

class B extends A {
    void hello() {
        System.out.println("b class method");
    }
}

public class NonAbstract {
    public static void main(String[] args) {
        B p = new B();
        p.show();
        p.hello();
    }
}
