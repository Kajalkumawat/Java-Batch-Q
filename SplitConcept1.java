    public class SplitConcept1 {
        public static void main(String[] args) {
            // how are you -->you are how
            String s = "how are you ";
            String a[] = s.split(" ");
            for (int i = a.length - 1; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
        }
    }
