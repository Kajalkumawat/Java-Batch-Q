public class ArrayBasic3 {
    static int sum=0;
    public static int sumOf(int a[],int i){
        if(a.length==i){
            return 1;
        }
        sum=sum+a[i];
        sumOf(a,i+1);
        return sum;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(sumOf(a,0));
    }   
}
