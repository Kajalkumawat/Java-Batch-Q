class A {
    // non static variable
    int a;

    A() {
        a++;
        System.out.println(a);
    }
}

public class NonStaticVariable {
    public static void main(String[] args) {
        new A();
        new A();
        new A();
    }
}
