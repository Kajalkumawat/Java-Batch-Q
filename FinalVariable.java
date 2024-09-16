public class FinalVariable {
    public static void main(String[] args) {
        // local variable
        int a = 89;
        a = 9;
        System.out.println(a);

        //local variable 
        final int b=89;
        b=67; //error
        System.out.println(a);
    }
}
