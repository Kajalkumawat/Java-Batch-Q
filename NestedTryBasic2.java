public class NestedTryBasic2 {
    public static void main(String[] args) {
        try {
            try {
                int a = 9 / 0;
                System.out.println(a);
            } catch (ArithmeticException ex) {
                System.out.println(ex);
            }

            try {
                int a[] = new int[5];
                a[6] = 9;
                System.out.println(a[6]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex);
            }
        } catch (Exception ex) {
            System.out.println("handle");
        }
    }
}
