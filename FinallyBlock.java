public class FinallyBlock {
    public static void main(String[] args) {
        try{
            int a=9/0;
            System.out.println(a);
        }
        finally{
            System.out.println("always execute");
        }
    }
}
