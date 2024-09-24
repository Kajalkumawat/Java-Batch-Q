public class Refrence {
    Ab p;// class refrence variable
    int a;

    Refrence(Ab p, int a) {
        this.p = p;
        this.a = a;
    }

    void show() {
        System.out.print(p.name + " " + p.num);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Ab k = new Ab("kajal", 67);
        Refrence r = new Refrence(k, 67);
        r.show();
    }
}
