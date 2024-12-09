public class Stringfrequency {
    public static void main(String[] args) {
        String s = "regex is learning platform";
        char a[] = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j =0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            System.out.println(a[i] + " " + count);
        }
    }
}
