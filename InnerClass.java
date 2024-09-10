class A {
    class B {
        void show() {
            System.out.println("inner class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A k=new A();
        A.B p=k.new B();
        p.show();
    }
}
