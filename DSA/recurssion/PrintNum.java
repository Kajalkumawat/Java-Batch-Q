public class PrintNum {
    //print number :
    public static void printn(int n){
       if(n==0){
        return;
       }
       printn(n-1);
       System.out.print(n+" ");
       
    }
    public static void main(String[] args){
        printn(5);
    }
}
