class A extends Thread { 
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {

            }
            System.out.print(i + " ");
        }
    }
}

public class SleepMethod {
    public static void main(String[] args) {
        A s1 = new A();
        A s2 = new A();
        s1.start();
        s2.start();
    }
}