public class StringVowel {
    public static void main(String[] args) {
        String s = "hello world";
        char a[] = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
                System.out.println("vowel " + a[i]);
            }
        }
    }
}
