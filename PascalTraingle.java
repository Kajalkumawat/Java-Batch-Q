        public class PascalTraingle {
            // print method
            public static void printArray(int a[][]) {
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            // pascals traingle
            public static int[][] pascal(int n) {
                int ans[][] = new int[n][];
                // for row loop
                for (int i = 0; i < n; i++) {
                    // for rows column
                    ans[i] = new int[i + 1];
                    ans[i][0] = 1;
                    ans[i][i] = 1;
                    // column
                    for (int j = 1; j < i; j++) {
                        ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
                    }
                }
                return ans;
            }

            public static void main(String[] args) {
                int n = 5;
                int pascal[][] = pascal(n);
                printArray(pascal);
            }
        }