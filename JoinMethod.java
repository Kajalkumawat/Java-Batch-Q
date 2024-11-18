class A extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            System.out.print(i + " ");
        }
    }
}

public class JoinMethod {
    public static void main(String[] args) {
        A s1 = new A();
        A s2 = new A();
        s1.start();
        try {
            s1.join();
        } catch (InterruptedException ex) {
        }
        s2.start();
        
    }
}
