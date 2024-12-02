public class StringBuilderConstructor2 {
    public static void main(String[] args) {
        // StringBuilder sb=new StringBuilder(StringBuilder sb1);
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder(sb1);
        System.out.println(sb2);
    }
}
