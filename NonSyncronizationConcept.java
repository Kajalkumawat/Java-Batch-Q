class A {
    public void wish(int n) {
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
public class NonSyncronizationConcept {
    public static void main(String[] args) {
        A a=new A();
        B t1=new B(a);
        B t2=new B(a);
        t1.start();
        t2.start();
    }
}
