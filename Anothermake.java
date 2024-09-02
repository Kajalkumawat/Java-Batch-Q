abstract class A {
    abstract void hello();
}

class B {
    void show1() {
        A l = new A() {
            void hello() {
                System.out.println("helloo");
            }
        };
        l.hello();
    }
}

public class Anothermake {
    public static void main(String[] args) {
        B k = new B();
        k.show1();
    }
}
