class A {
    A() {
        System.out.println("constructor call");
    }

    // anonymous
    {
        System.out.println("anonymous block");
    }
    static {
        System.out.println("this is static block");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        new A();
    }
}
//why main method static in java :because of jvm always have first priority of static block 
