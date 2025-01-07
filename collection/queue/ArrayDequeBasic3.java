import java.util.*;
public class ArrayDequeBasic3 {
    public static void main(String[] args) {
        ArrayDeque<String> ad=new ArrayDeque<>();
        ad.add("hello");
        ad.add("byee");
        ad.add("hii");
        for(String s:ad){
            System.out.print(s+" ");
        }
    }
}
