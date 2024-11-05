public class NestedTryBasic1 {
    public static void main(String[] args) {
        try {
            try {
                int a = 9 / 0;
                System.out.println(a);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("arithemtic handle");
            }
        } catch (ArithmeticException ex) {
            System.out.println("exception class handle");
        }
    }
}