// method overhiding  :class name diffrent and method name same but all methods must be static 
class A {
    static void show(int a) {
        System.out.println(a);
    }
}

class First  extends A {
    static void show(int a) {
        System.out.println(a);
    }

}
