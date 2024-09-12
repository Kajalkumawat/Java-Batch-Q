class A {
    // static variable
    static int a = 89;

    // non static method
    void show() {
        System.out.println(a);
    }
}

public class Concept1 {
    public static void main(String[] args) {
        A p = new A();
        p.show();
    }
}
