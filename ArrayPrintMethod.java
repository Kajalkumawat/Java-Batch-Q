public class ArrayPrintMethod {
    static public void print(int a) {
        System.out.println(a);
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a = 78;
        print(a);
        int b[] = { 56, 79, 35, 35, 3, 23 };
        printArray(b);
    }
}
