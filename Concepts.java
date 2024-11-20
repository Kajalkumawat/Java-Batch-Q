class A {
    String name;

    A(String name) {
        this.name = name;
    }
}

class B {
    A a;

    B(A a) {
        this.a = a;
    }

    void show() {
        System.out.println(a.name);
    }
}

public class Concepts {
    public static void main(String[] args) {
        A s = new A("hello");
        B p = new B(s);
        p.show();
    }
}