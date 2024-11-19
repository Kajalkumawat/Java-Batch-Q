
public class ThreadConstructorCase3 {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.setName("first call of settter method");
        System.out.println(t.getName());

        Thread t1 = new Thread("second call");
        System.out.println(t1.getName());

        // we want to reassign the value of t1 constructor
        t1.setName("reassign string");
        System.out.println(t1.getName());
    }
}
