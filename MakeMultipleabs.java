//can we make multiple abstract class :yes 
abstract class A {
    abstract void show();
}

abstract class B {
    abstract void show1();
}

class C extends B {
    void show1() {
        System.out.println("abstract class B");
    }
}

class D extends A {
    void show() {
        System.out.println("abstract class A");
    }
}

public class MakeMultipleabs {
    public static void main(String[] args) {
        C p = new C();
        p.show1();
        D o = new D();
        o.show();
    }
}
