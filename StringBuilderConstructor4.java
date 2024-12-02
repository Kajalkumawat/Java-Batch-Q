public class StringBuilderConstructor4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World ");
        StringBuilder sb1 = new StringBuilder(sb);
        System.out.println(sb1);
        StringBuilder sb2=new StringBuilder(89);
        System.out.println(sb2);
    }
}
