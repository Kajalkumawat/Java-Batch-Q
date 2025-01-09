import java.util.*;

public class StackBasic {
    public static void main(String[] args) {
        //two type :generic and non-generic 
        Stack st1=new Stack<>();
        st1.push(12);
        st1.push("hello");
        st1.push(6.7f);
        System.out.print(st1);

        Stack<Integer> st2=new Stack<>();
        st2.push(23);
        st2.push(51);
        st2.push(61);
        System.out.print(st2);
    }
}