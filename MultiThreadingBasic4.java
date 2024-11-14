class A extends Thread{
    public void run(){
        System.out.println("hello ");
    }
    public void run(int a){
        System.out.println(a);
    }
}
public class MultiThreadingBasic4 {
    public static void main(String[] args) {
       A p=new A();
       p.start(); 
    }
}
