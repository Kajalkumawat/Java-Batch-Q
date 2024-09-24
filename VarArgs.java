//multiple data stored into single variable 
class A {
    void show(int... a) {
        // for each loop
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}

public class VarArgs {
    public static void main(String[] args) {
        A p = new A();
        p.show(2, 3, 4, 5, 6, 78);
    }
}