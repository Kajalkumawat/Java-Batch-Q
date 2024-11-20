class A {
    public static synchronized void wish(int n) {
        for (int i = 1; i <= n; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {

            }
            System.out.print(i + " ");
        }
    }
}
class B extends Thread{
    public void run(){
        A.wish(10);
    }
}
class C extends Thread{
    public void run(){
        A.wish(5);
    }
}
public class StaticSyncrnizedBlock {
    public static void main(String[] args) {
        B p=new B();
        C c=new C();
        p.start();
        c.start();
    }
}
