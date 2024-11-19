public class ThreadConstructorCase2 {
    public static void main(String[] args) {
        // 2)Thread t=new Thread(String name);
        Thread t = new Thread("thread string");
        // predefine method :getName() :print thread string
        System.out.println(t.getName());
    }
}
