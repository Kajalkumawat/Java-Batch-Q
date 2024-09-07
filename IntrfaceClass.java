interface A {
    class B {
        void show() {
            System.out.println("inside the interface ");
        }
    }
}

class C extends A.B {

}

public class IntrfaceClass {
    public static void main(String[] args) {
        C p=new C();
        p.show();
    }
}
