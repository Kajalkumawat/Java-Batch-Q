class A {
    // static method
    static void show() {
        System.out.println("this is static method");
    }

    // non-static method
    void show1() {
        System.out.println("non-static method ");
    }
}

public class BasicStaticMethod {
    public static void main(String[] args) {
        // easy to access through class name and without object creation
        A.show();
        // non-static :must be creation of object
        A p = new A();
        p.show1();
    }
}
