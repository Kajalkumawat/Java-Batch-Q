class A {
    interface B {
        class C {
            void show() {
                System.out.println("class--interface--class");
            }
        }
    }
}
class D extends A.B.C{

}
public class ClassInterfaceClass {
    public static void main(String[] args) {
        D p=new D();
        p.show();
    }
}
