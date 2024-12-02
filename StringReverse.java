public class StringReverse {
    public static void main(String[] args) {
        String s = "hello";
        // string convert char (array type )
        // tochararray predefine method :string convert into character
        char a[] = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("for each loop");
        for (char k : a) { 
            System.out.print(k + " ");
        }
    }
}