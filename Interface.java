interface A {
    // by default :public and abstract
    void show();
}

class B implements A {
    public void show() {
        System.out.println("interface implements ");
    }
}

public class Interface {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}
