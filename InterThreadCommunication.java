class A extends Thread {
    // instance variable
    int total = 0;

    public void run() {
        // syncronized block
        synchronized (this) {
            System.out.println("first time");// step2
            for (int i = 1; i <= 10; i++) {
                total = total + i;
            }
            System.out.println("second time ");// step3
            this.notify();
            System.out.println("inside the notify");// step4
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException {
        A p = new A();
        p.start();
        synchronized (p) {
            System.out.println("third time");// step 1
            p.wait();
            System.out.println("fourth time");// step5
            System.out.println(p.total);// step6
        }
    }
} 