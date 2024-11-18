class A extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("parent thread");
        }
    }
}

public class YieldMethod {
    public static void main(String[] args) {
        A p = new A();
        p.start();
        for (int i = 1; i <= 3; i++) {
            Thread.yield();
            System.out.println("main thread");
        }
    }
}
