public class ThrowsCase4 {
    // multiple exception write in code
    static void show() throws ArithmeticException, NullPointerException {
        System.out.println("handle");
    }

    public static void main(String[] args) {
        show();
    }
}
