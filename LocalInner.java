class A {
    void show() {
        class B {
            void show1() {
                System.out.println("hello");
            }
        }
        B p = new B();
        p.show1();
    }
}

public class LocalInner {
    public static void main(String[] args) {
        A p = new A();
        p.show();
    }
}
