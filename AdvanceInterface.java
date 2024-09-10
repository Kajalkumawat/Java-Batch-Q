//interface --->class--->interface 
interface A {
    void show1();
   
    class B {
        void show2() {
            System.out.println("inner classs");
        }

        interface C {
            void show3();
        }
    }

    class D implements B.C {
        public void show3() {
            System.out.println("interface implement ");
        }
    }

   
}

class F extends A.B {
    public void show1() {
        System.out.println("outer interface");
    }
}
class G extends A.D{

}
public class AdvanceInterface {
    public static void main(String[] args) {
        F k = new F();
        k.show1();
        k.show2();
        G p=new G();
        p.show3();
    }
}
