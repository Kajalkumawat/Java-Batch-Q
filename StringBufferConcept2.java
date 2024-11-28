public class StringBufferConcept2 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
    }
}
