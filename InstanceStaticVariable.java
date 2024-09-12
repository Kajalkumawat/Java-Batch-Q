class A {
    // static variable is known as class variable
    static int a;

    A() {
        a++;
        System.out.println(a);
    }
}

public class InstanceStaticVariable {
    public static void main(String[] args) {
        new A();
        new A();
        new A();
    }
}
