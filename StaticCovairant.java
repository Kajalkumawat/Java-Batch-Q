public class StaticCovairant {
    static StaticCovairant show() {
        System.out.println("hello");
        return new StaticCovairant();
    }

    public static void main(String[] args) {
        StaticCovairant.show();
    }
}