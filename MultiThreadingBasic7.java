class A extends Thread {
    public void run() {
        System.out.println("thread class method");
    }

    public void start() {
        System.out.println("start method");
    }
}

public class MultiThreadingBasic7 {
    public static void main(String[] args) {
        A p = new A();
        p.start();
    }
}
