public class NestedTryBasic4 {
    public static void main(String[] args) {
        try{
            System.out.println("hello world");
            try{
                int a=9/0;
                System.out.println(a);
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("handle array");
            }
            finally{
                System.out.println("final block");
            }
            System.out.println("rest of code");
        }
        catch(Exception ex){
            System.out.println("catch block ");
        }
    }
}
