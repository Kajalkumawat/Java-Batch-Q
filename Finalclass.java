//final class : it does inherit means it does not follow inheritance concept 
final class A {
    void show1() {
        System.out.println("hiii");
    }
}
//error 
class B extends A {
    void show2() {
        System.out.println("hello");
    }
}

public class Finalclass {
    public static void main(String[] args) {
        B k=new B();
        k.show1();
        k.show2();
    }
}
