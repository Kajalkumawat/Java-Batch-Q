public class StringConstructor4 {
    public static void main(String[] args) {
        // String s=new String(String Builder sb);
        StringBuilder sb = new StringBuilder("hello world");
        String s = new String(sb);
        System.out.println(s);
    }
}
