public class ArrayBasic1 {
    public static void printn(int arr[],int index){
        if(arr.length==index){
            return;
        }
       
        System.out.print(arr[index]+" ");
        printn(arr,index+1);
    }
public static void main(String[] args){
    int a[]={1,2,3,4,5};
    printn(a,0);
}
}
