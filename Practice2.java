/*user input age : 
	less than 18 then give exception user define exception 

	greater than 18 : you  are valid for vote  */
class Voter extends RuntimeException { 
    public Voter(String msg) {
        System.out.println(msg);
    }
}

class Check {
    static void voterId(int age) {
        if (age < 18) {
            // message print through user define exception class
            throw new Voter("you are not eligible");
        } else {
            System.out.println("you are valid for vote");
        }
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Check.voterId(6);
    }
}
