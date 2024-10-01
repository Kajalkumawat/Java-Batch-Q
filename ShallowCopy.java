//when make two array and copy of the both array then changes first array it totally effect on second array this is shallow copy (due to first array and second array element stored at same address )
public class ShallowCopy {
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
        // change arr data then changes in arr arr1 both
        arr[0] = 78;
        arr[1] = 89;
        System.out.println("first array");
        printArray(arr);
        System.out.println("second array");
        printArray(arr1);
    }
}
