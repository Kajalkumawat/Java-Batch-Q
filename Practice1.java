/*user input age : 
	less than 18 then give exception predefine exception 

	greater than 18 : you  are valid for vote  */
class A {
    static void show(int age) {
        if (age < 18) {
            // exception print :
            throw new ArithmeticException("you are not valid for vote");
        } else {
            System.out.println("you are valid for vote");
        }
    }
}

public class Practice1 {
    public static void main(String[] args) {
        A.show(7);
    }
}