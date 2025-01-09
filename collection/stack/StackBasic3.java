import java.util.*;
public class StackBasic3 {
    public static void main(String[] args) {
       Stack<Integer> st=new Stack<>();
       st.push(23) ;
       st.push(12);
       st.push(1);
       System.out.println(st);
       st.pop();
       System.out.println(st);
       st.pop();
       System.out.println(st); 
       st.pop();
       System.out.println(st);
       st.pop();
       System.out.println(st);
    }
}
