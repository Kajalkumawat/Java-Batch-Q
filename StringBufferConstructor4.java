public class StringBufferConstructor4 {
    public static void main(String[] args) {
        // d)StringBuffer sb=new StringBuffer(StringBuffer sb1);
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer(sb1);
        System.out.println(sb2);
    }
}