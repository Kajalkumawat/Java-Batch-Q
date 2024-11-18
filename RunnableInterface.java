class A implements Runnable {
    // runable interface include :run method
    public void run() {
        System.out.println("hello world");
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        A p = new A();
        // thread class through
        Thread t = new Thread(p);
        //start method :thread class 
        t.start();
    }
}
