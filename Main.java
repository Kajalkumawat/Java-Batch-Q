// polymorphism :
// ->poly means :multiple

// morphism :single forms

// a single action in different ways

// types :
// a)run time polymorphism Dynamic Method Dispatch
// ->method overriding ,method overhiding

// b)compile time polymorphism Static Method Dispatch
// ->method overloading, constructor overloading , constructor chaining
// ---------------------------------------------------------------------
// method overriding :
// ->class name different but method name same

// class A {
// void show() {
// System.out.println("A class method");
// }
// }

// class B extends A {
// void show() {
// System.out.println("B class method");
// }
// }

// public class Main1 {
// public static void main(String[] args) {
// B p = new B();
// p.show();
// }
// }
// -----------------------------------------------------
// ->class name different and method name same but number of prameters will be
// different then code will be override or not

// yes it will be override

// class A {
// void show(int a) {
// System.out.println("A class method");
// }
// }

// class B extends A {
// void show(int a, int b) {
// System.out.println("B class method" + a + " " + b);
// }
// }

// public class Main1 {
// public static void main(String[] args) {
// B p = new B();
// p.show(3, 4);
// }
// }
// -------------------------------------------------------------------
// how to solve the problem :

// super :it is a keyword and used to refer the parent class method in method
// overriding

// class A {
// void show() {
// System.out.println("A class method");
// }
// }

// class B extends A {
// void show() {
// super.show();
// System.out.println("B class method");
// }
// }

// public class Main1 {
// public static void main(String[] args) {
// B p = new B();
// p.show();
// }
// }
// -----------------------------------------------------------------
// ->class name different and method name same but number of prameters will be
// same but return type of method diffrent then code will be override or not

// it is not possible

// class A {
// int show() {
// System.out.println("A class method");
// return 0;
// }
// }

// class B extends A {
// void show() {
// System.out.println("B class method");
// }
// }

// public class Main1 {
// public static void main(String[] args) {
// B p = new B();
// p.show();
// }
// }
// -----------------------------------------------------------------
