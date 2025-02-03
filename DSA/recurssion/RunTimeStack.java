class A{
    void show1(){
        System.out.println("show1");
    }
    void show2(){
        show1();
        System.out.println("show2");
    }
    void show3(){
        show2();
        System.out.println("show3");
    }
}
public class RunTimeStack{
    public static void main(String[] args){
        A k=new A();
        k.show3();
    }
}