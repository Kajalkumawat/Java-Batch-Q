public class PrintTable {
    public static void printn(int num,int n){
        if(num==0){
            return;
        }
        printn(num-1, n);
        System.out.print(num*n+" ");
    }
    public static void main(String[] args) {
        //1---10 
        printn(10,2);
    }
}
