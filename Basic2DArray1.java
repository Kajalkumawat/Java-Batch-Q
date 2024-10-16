public class Basic2DArray1 {
    public static void printn(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = { { 24, 92 }, { 24, 67 }, { 6, 7 } };
      printn(a);

    }
}
