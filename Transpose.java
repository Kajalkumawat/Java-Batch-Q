public class Transpose {
    public static void printn(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int a[][]) {
        int ans[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                ans[i][j] = a[j][i];
            }
            System.out.println();
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        printn(a);
        int b[][] = transpose(a);
        printn(b);

    }
}