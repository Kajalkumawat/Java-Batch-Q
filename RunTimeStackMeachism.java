class A {
    void show1() {
        System.out.println("show1 method");
    }

    void show2() {
        show1();
        System.out.println("show2 method");
    }

    void show3() {
        show2();
        System.out.println("show3 method");
    }
}

public class RunTimeStackMeachism {
    public static void main(String[] args) {
        A p=new A();
        p.show3();
    }
}
