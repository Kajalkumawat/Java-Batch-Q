public class ArrayBasic2 {
    public static boolean targetNum(int a[],int target,int index){
        if(a.length==index){
            return false;
        }
        if(a[index]==target){
            return true;   
        }
        return targetNum(a, target, index+1);
    }
   public static void main(String[] args) {
    int a[]={1,2,3,4,5};
    if(targetNum(a, 3, 0)){
        System.out.println("this is present ");
        }
        else{
            System.out.println("not present ");
        }
   } 
}
