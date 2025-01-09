import java.util.*;
public class StackBasic1 {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        st.push("hello");
        st.push("hii");
        st.push("bye bye ");
        st.push("tata ");
        System.out.println(st);

        // st.pop();
        // System.out.println(st);
        int n=st.size()/2;
        for(int i=1;i<=n;i++){
            st.pop();
        }
        System.out.println(st);
    }
}
