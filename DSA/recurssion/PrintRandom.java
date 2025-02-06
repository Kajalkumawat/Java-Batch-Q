public class PrintRandom {
    // random number
    public static void printrandom(int start, int end) {
        if(start>end){
            return ;
        }
        System.out.print(start+" ");
        printrandom(start+1,end);
    }

    public static void main(String[] args) {
        printrandom(5, 10);
    }
}
