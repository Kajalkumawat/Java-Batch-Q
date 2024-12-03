public class SplitMethod{
    public static void main(String[] args) {
        String s="java is a programming language";
        //every word seprate (array convert )
        String a[]=s.split(" ");
        System.out.println(a[0]+" "+a[a.length-1]);
    }
}