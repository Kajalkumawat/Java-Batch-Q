// can we make object of abstract class : no because abstract class have not make constructor 
// can we make refrence variable of abstract class : yes 

abstract class A {
    abstract void show();
}

class B extends A {
    void show() {
        System.out.println("abstract method ");
    }
}

public class ObjectofAbstract {
    public static void main(String[] args) {
        // create object of abstract classs :no
        // A p=new A();
        // can we create refrence variable of abstract class :yes
        A p = new B();
        p.show();
    }
}
