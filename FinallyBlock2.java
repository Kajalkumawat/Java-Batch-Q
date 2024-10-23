public class FinallyBlock2 {
    public static void main(String[] args) {
        try {
            int a = 9 / 0;
            System.out.println(a);
        } catch (ArithmeticException ex) {
            System.out.println("handle");
        } finally {
            System.out.println("always execute");
        }
        System.out.println("rest of the code");
    }
}
