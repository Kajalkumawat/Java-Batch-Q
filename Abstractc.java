public class Abstractc extends Second {
    void show() {
        System.out.println("abstraction ");
    }

    public static void main(String[] args) {
        Second p = new Second() {
            void show() {
                System.out.println("abstract method ");
            }
        };
        p.show();
        Abstractc k = new Abstractc();
        k.show();
        Second l = new Abstractc();
        l.show();
    }
}
