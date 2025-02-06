public class Fibonacci {
    public static int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int pre=fib(n-1);
        int prePre=fib(n-2);
        return pre+prePre;
    }
    public static void main(String[] args) { 
        for(int i=1;i<=5;i++){
            System.out.print(fib(i)+" ");
        }
    }
}
