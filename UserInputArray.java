import java.util.*;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        // array create
        int a[] = new int[size];
        // for loop for input of data
        for (int i = 0; i < size; i++) {
            System.out.println("enter value ");
            a[i] = sc.nextInt();
        }
        // for loop for print data
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
