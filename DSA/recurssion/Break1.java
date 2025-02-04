class A{
    static void show(){
        for(int i=1;i<=5;i++){
            if(i==4){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println("hello ");
    }
}
public class Break1 {
    public static void main(String[] args) {
       A.show();
    }
}
