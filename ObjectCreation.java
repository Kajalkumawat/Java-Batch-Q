//can we make object of interface and can we make refrence variable of the interface 
interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("create object ");
    }
}

public class ObjectCreation {
    public static void main(String[] args) {
        A k = new B();
        k.show();
    }
}
