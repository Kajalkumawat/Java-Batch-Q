//runtime class ---> exception 
/*
 * no overiding and no problem solve
 */ 
class A {
    void show() throws RuntimeException {
        System.out.println("A class");
    }
}

class B extends A {
    void show() throws Exception {
        System.out.println("B class");
    }
}

public class ExceptionOverridingCase9 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}
