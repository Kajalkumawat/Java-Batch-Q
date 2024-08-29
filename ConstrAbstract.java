//can we make constructor of abstract class :

abstract class A {
    // constructor does not make abstract and static and final
    A() {
        System.out.println("hello World");
    }

    abstract void show();
}

class B extends A {
    void show() {
        System.out.println("b class method");
    }
}

public class ConstrAbstract {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}
