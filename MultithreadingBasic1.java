class A extends Thread {// normal class convert thread class
    // predefine method :run method
    public void run() {
        System.out.println("first thread code");
    } 
}

public class MultithreadingBasic1 {
    public static void main(String[] args) {
        A p = new A();
        // thread incative stage ----->acitve stage (used start method)
        p.start();
    }
}