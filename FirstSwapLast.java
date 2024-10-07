public class FirstSwapLast {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int firstIndex = 0;
        int lastIndex = a.length - 1;
        int c = 0;
        for (int i = 1; i < a.length; i++) {
            if (i % 2 == 0) {
                if (c == 0) {
                    firstIndex = i;
                    c++;
                }
                lastIndex = i;
            }
        }
        int temp = a[firstIndex];
        a[firstIndex] = a[lastIndex];
        a[lastIndex] = temp;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
