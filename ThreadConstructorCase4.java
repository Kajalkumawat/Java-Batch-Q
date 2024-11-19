class A implements Runnable {
    public void run() {
        System.out.println("threadd class ");
    }
}

public class ThreadConstructorCase4 {
    public static void main(String[] args) {
        // 3)Thread t=new Thread(Runnable r);
        A p=new A();
        Thread t=new Thread(p);
        t.start();
    }
}
