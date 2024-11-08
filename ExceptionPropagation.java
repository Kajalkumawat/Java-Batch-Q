class A {
    void show1() {
        try {
            int a = 9 / 0;
            System.out.println(a);
        } catch (Exception ex) {
            System.out.println("handle");
        }
    }

    void show2() {
        show1();
    }

    void show3() {
        show2();
    }
}

public class ExceptionPropagation {
    public static void main(String[] args) {
        A p = new A();
        p.show3(); 
    }
}
