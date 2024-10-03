public class MaxArray {
    public static void main(String[] args) {
        int a[] = { 12, 65, 78, 24, 4, 13 };
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
