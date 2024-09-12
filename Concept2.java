class A {
    // non static variable
    int a = 89;

    static void show() {
        System.out.println(a);
    }
}

// non static variable will be accessed static method :
public class Concept2 {
    public static void main(String[] args) {
        // error code
        A p = new A();
        p.show();
    }
}
