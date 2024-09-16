//final method does not override in java 
class A {
    final void show() {
        System.out.println("final method");
    }
}

// error
class B extends A {
    final void show() {
        System.out.println("B method");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}
