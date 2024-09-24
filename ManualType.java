public class ManualType {
    public static void main(String[] args) {
        // double -> float -> long -> int -> char -> short -> byte
        double a = 7.896;
        float b = (float) a;
        System.out.println(b);

        float c = 8.965f;
        short d = (byte) c;
        System.out.println(c + " " + d);
    }
}
