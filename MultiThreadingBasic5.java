class A extends Thread {
    public void run() {
        System.out.println("hello");
    }
}

class B extends A {
    public void run() {
        super.start();//IllegalThreadStateException (thread run method call)
        System.out.println("world");
    }
}

public class MultiThreadingBasic5 {
    public static void main(String[] args) {
        B p = new B();
        p.start();
    }
}
