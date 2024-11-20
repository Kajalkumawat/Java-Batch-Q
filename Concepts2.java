class A {
    String name;

    public void show(String name) {
        this.name = name;
        System.out.println(name);
    }
}

class B {
    A a;
    B(A a){
        this.a=a;
    }
    void display() {
        a.show("hello");
    }
}

public class Concepts2 {  
    public static void main(String[] args) {
        A k=new A();
         B p=new B(k);
         p.display();
    }
}
