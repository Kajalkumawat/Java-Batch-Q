abstract class A {
    abstract void show();
}

public class Anonymousclass {
    public static void main(String[] args) {
        //anonymous inner class
        A k = new A() {
            void show() {
                System.out.println("helllooo");
            }
        };
        k.show();
    }
}