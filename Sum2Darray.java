public class Sum2Darray {
    public static void sum(int a[][]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 7, 8, 9 } };
        sum(a);
    }
}
