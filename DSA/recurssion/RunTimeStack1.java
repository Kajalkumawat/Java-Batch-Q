class A{
    void show1(){
        int x=0;
        System.out.println(x);
    }
    void show2(){
        int x=1;
        show1();
        System.out.println(x);
    }
    void show3(){
        int x=2;
        show2();
        System.out.println(x);
    }
}
public class RunTimeStack1 {
    public static void main(String[] args) {
        A s=new A();
        s.show3();
    }
}
