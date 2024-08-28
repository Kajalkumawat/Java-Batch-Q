//create abstract class
abstract class Mahindra {
    // abstract method
    abstract void engine();// method only declare
}

class Thar extends Mahindra {
    // define method of abstract class
    void engine() {
        System.out.println("this is the mahindra company ");
    }
}

public class AbstractionBasic {
    public static void main(String[] args) {
        Thar thar = new Thar();
        thar.engine();
    }
}