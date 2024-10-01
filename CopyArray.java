public class CopyArray {
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // copy of the element of the variable
        int a = 78;
        int b = a;
        System.out.println(a + " " + b);
        // array copy
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("orignal array");
        int arr1[] = arr;
        System.out.println("copy array");
        printArray(arr1);
    }
}
