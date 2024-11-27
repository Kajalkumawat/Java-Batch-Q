public class StringConstructor3 {
    public static void main(String[] args) {
        // String s=new String(StringBuffer sb);
        StringBuffer sb = new StringBuffer("string buffer constructor ");
        String s = new String(sb);
        System.out.println(s);
    }
}
