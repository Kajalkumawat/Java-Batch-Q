interface A {
    void show();
}

interface B extends A {
    void show1();
}

class C implements B {
    public void show() {
        System.out.println("hello world");
    }

    public void show1() {
        System.out.println("interface 2 ");
    }
}

public class InterfaceInterface {
    public static void main(String[] args) {
        C p = new C();
        p.show();
        p.show1();
    }
}
