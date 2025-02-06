    public class SumOfNumber {
        public static int sum(int n){
            if(n==0){
                return 0;
            }
            // int total=sum(n-1)+n;
            // return total;
            return sum(n-1)+n;
        }
        public static void main(String[] args) {
            System.out.println(sum(5));
        }
    }
