public class TimeComlexity{
    static void basicTimeComplexity(){
        //O(n)
        for(int i=1;i<=5;i++){
            System.out.print(i+" ");
        }
        //O(n)
        for(int i=1;i<=5;i++){
            System.out.print(i+" ");
        }
        //O(n)
        for(int i=1;i<=5;i++){
            System.out.print(i+" ");
        }
        //overall time comlexity : O(n) +O(n) +O(n) =>O(3n)
    }
    //O(n square)
    static void basicTimeComplexity1(){
        //n square : 
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                for(int k=1;k<=5;k++){
                    //O(n3)
                }
            }
        }
    }
    public static void main(String[] args){
        basicTimeComplexity();
        basicTimeComplexity1();
    } 
}