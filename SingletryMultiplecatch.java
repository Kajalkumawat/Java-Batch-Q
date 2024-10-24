public class SingletryMultiplecatch {
    public static void main(String[] args) {
        try {
            int a = 9 / 0;
            System.out.println(a);
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException handle");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArithmeticException handle");
        } catch (Exception ex) {
            System.out.println("handle");
        }
    }
}
