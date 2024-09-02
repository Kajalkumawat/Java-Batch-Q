//can we make multiple interface and achived multiple inheritance : 

interface A {
    void show();
}

interface B {
    void show1();
}

class C implements A, B {
    public void show() {
        System.out.println("A interface");
    }

    public void show1() {
        System.out.println("B interface");
    }
}

public class AchieveMultiple {
    public static void main(String[] args) {
        C k = new C();
        k.show();
        k.show1();
    }
}
