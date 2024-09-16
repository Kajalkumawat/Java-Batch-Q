//singleton class | factory method | production method | singleton design method |singleton design pattern :when make object inside the same class and constructor will be private 
class A {
    private A() {
        System.out.println("private constructor");
    }

    static void show() { 
        new A();
        System.out.println("hello"); 
    }
}

public class SingletonClass {
    public static void main(String[] args) {
        A.show();
    }
}
