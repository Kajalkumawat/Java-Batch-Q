public class NestTryBasic3 {
    public static void main(String[] args) {
        try {
            try {
                try {
                    int a[] = new int[5];
                    a[7] = 9/0;
                    System.out.println(a[7]);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
