public class StringCount {
    public static void main(String[] args) {
        String s = "hello world ";
        System.out.println(s.length());
        // predefine -->userdefine
        int count = 0;
        char a[] = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            count++;
        }
        System.out.println(count);
    }
}
