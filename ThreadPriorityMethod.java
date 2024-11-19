public class ThreadPriorityMethod {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t.getPriority());
        t.setPriority(9);
        System.out.println(t.getPriority());
    }
}
