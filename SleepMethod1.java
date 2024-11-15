class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            System.out.print(i + " ");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            System.out.print(i + " ");
        }
    }
}

public class SleepMethod1 {
    public static void main(String[] args) {
        A p = new A();
        p.start();
        B k = new B();
        k.start();
    }
}
