public class SumofDigit{
    public static int sum(int n){
        //number 0 and 9 
        if(n>=0 && n<=9){
            return n;
        }
        int small=sum(n/10);
        int add=small+n%10;
        return add;
    }
    public static void main(String[] args){
        int n=674;
        System.out.println(sum(n));
        // int sum=0;
        // while(n>0){
        //     sum=sum+n%10;
        //     n=n/10;
        // }
    }
}