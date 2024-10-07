public class BinarySearch {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int li = 0;
        int hi = a.length - 1;
        int search = 6;
        int mid = (li + hi) / 2;
        while (li <= hi) {
            // condition
            if (a[mid] == search) {
                System.out.println("element found");
                break;
            }
            if (a[mid] > search) {
                hi = mid - 1;
            } else {
                li = mid + 1;
            }
            mid = (li + hi) / 2;
        }
        if (li > hi) {
            System.out.println("not found");
        }
    }
}
