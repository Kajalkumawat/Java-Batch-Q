public class ArithmeticexceptionJava {
    public static void main(String[] args) {
        System.out.println("outer try statement ");
        try {
            int a = 9 / 0;
            System.out.println(a);
        } catch (ArithmeticException ex) {
            System.out.println("exception handle");
        }
        System.out.println("rest of the code ");
    }
}
