<<<<<<< HEAD
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
=======
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
>>>>>>> ee8547dc2c00f5cf151e824b1e26403482892b4d
}