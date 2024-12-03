public class StringBasic1 {
    public static void main(String[] args) {
        // count total number of words
        String s = "java is a programming language ";
        String a[] = s.split(" ");
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            c++;
        }
        System.out.println(c);
    }
}
