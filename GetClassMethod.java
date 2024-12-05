class A {
    void show() {
        System.out.println("hello");
    }
}

public class GetClassMethod {
    public static void main(String[] args) {
        A p = new A();
        p.show();
        System.out.println(p.getClass());
        System.out.println(p.getClass().getName());
    }
}