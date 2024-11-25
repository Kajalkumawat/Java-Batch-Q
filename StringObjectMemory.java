public class StringObjectMemory {
    public static void main(String[] args) {
        String s = new String("hello");
        System.out.println("orignal string value "+s);
        s.concat("world");
        System.out.println("after concat value "+s);
        s = s.concat("duniya");
        System.out.println("after store in object value"+s);
    }
}
