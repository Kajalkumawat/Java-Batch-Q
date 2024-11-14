class A extends Thread {
    public void run() {
        System.out.println("thread class");
    }
}

public class MultiThreadingBasic8 {
    public static void main(String[] args) {
        A p = new A();
        p.start();
        p.start();//IllegalThreadStateException
    }
}
