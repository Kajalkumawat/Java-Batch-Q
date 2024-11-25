public class StringImmutableConcept {
    public static void main(String[] args) {
        String s = new String("hello");
        // want to add on in same string :concat method
        // concat method is used to add two string
        s.concat("world");
        System.out.println(s);
        s = "hello world";
        System.out.println(s);
    }
}
//SCP :it is used to print and store the data of string 