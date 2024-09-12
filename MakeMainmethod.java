//->create static method inside the main class : 
public class MakeMainmethod {
    static void show() {
        System.out.println("main class static method access");
    }

    public static void main(String[] args) {
        show();
    }
}
