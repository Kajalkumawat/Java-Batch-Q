public class NestedTryBasic1 {
    public static void main(String[] args) {
        try {
            try {
                int a = 9 / 0;
                System.out.println(a);
            } catch (ArithmeticException ex) {
                System.out.println("arithemtic handle");
            }
        } catch (Exception ex) {
            System.out.println("exception class handle");
        }
    }
}