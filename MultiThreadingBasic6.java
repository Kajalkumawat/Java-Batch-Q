class A extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("thread method ");
        }
    }
}

public class MultiThreadingBasic6 {
    public static void main(String[] args) {
        A p = new A();
        p.run();//normal call only
        for (int i = 1; i <= 3; i++) {
            System.out.println("main method");
        }
    }
}
