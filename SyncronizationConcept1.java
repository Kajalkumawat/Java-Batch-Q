class A {
    public  void wish(int n) {
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
    A a;
    B(A a){
        this.a=a;
    }
    public void run(){
        a.wish(5);
    }
}
class C extends Thread{
    A a;
    C(A a){
        this.a=a;
    }
    public void run(){
        a.wish(10);
    }
} 
public class SyncronizationConcept1 {
    public static void main(String[] args) {
        A p=new A();
        B b=new B(p);
        C c=new C(p);
        b.start();
        c.start();
    }
}
