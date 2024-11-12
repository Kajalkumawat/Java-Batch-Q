class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}

public class MultithreadingBasic2 {
    public static void main(String[] args) {
        A p = new A();
        p.start();

        for (int i = 1; i <= 5; i++) {
            System.out.print(i * 2 + " ");
        }
    }
}
