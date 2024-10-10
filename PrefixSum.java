public class PrefixSum {
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int[] prefixsum1(int a[]) {
        int n = a.length;
        int pre[] = new int[n];
        pre[0] = a[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + a[i];
        }
        return pre;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int prefix[] = prefixsum1(a);
        printArray(prefix);
    }
}
