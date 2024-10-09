import java.util.Arrays;

public class Sort {
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 2, 5, 1, 3 };
        // predefine sort
        Arrays.sort(a);
        printArray(a);
    }
}