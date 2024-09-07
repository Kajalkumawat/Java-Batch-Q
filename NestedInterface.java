interface A {
    interface B {
        void show();
    }
}

class C implements A.B {
    public void show() {
        System.out.println("nested interface implement");
    }
}

public class NestedInterface {
    public static void main(String[] args) {
        C p = new C();
        p.show();
    }
}