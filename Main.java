// // class A {
// // // method overloading
// // void show(float a) {
// // System.out.println("integer" + a);
// // }

// // int show(int a) {
// // System.out.println("int" + a);
// // return a;
// // }
// // }

// // public class Main {
// // public static void main(String[] args) {
// // A p = new A();
// // p.show(7);
// // }
// // }
// method overrhiding :

// class name diffrent and method name same but all methods must be static

// //mthod overhiding
// class A {
// static void show() {
// System.out.println("A class method ");
// }
// }

// class B extends A {
// static void show() {
// System.out.println("B class method");
// }
// }

// public class Main {
// public static void main(String[] args) {
// B p = new B();
// p.show();
// }
// }
// --------------------------------------------------
// solve the problem of method overriding :no

// inside the static method we will does not used super keyword
// -----------------------------------------------
// super used :
// first used method overriding

// second used of super keyword :
// ->super method is used for access the parent class constructor property
// class A {
// A(int a) {
// System.out.println("hello");
// }
// }

// class B extends A {
// B() {
// System.out.println("B constructor");
// }
// }

// public class Main {
// public static void main(String[] args) {
// new B();
// }
// }

// want to solve this problem : used super
// class A {
// A(int a) {
// System.out.println("hello" + a);
// }
// }

// class B extends A {
// B() {
// super(78);
// System.out.println("B constructor");
// }
// }

// public class Main {
// public static void main(String[] args) {
// new B();
// }
// }
// ----------------------------------------------------------------
// super third used : override variable

// class A {
// String name = "hello";
// }

// class B extends A {
// String name = "bye";

// void show() {
// System.out.println(name);
// }
// }

// public class Main {
// public static void main(String[] args) {
// B p=new B();
// p.show();
// }
// }
// ======================================================
// class A {
// String name = "hello";
// }

// class B extends A {
// String name = "bye";

// void show() {
// System.out.println(super.name);
// System.out.println(name);
// }
// }

// public class Main {
// public static void main(String[] args) {
// B p = new B();
// p.show();
// }
// }
// ======================================================
// compile time polymorphism :static binding | static method dispatch

// ->method overloading
// ->constructor overloading
// ->constructor chaining
// ======================================================
// method overloading :
// ->in a class method name same then method will be overloaded
// class A{
// //method overloading
// void show(){

// }
// void show(){

// }
// }
// public class Main {
// public static void main(String[] args) {

// }
// }
// ----------------------------------------------------
// want to solve the problem of method overloading :
// ->in a class method name same but number of parameters will be different
// class A {
// // method overloading
// void show(int a) {
// System.out.println(a);
// }

// void show() {
// System.out.println("Hello World");
// }
// }

// public class Main {
// public static void main(String[] args) {
// A p = new A();
// p.show();
// p.show(78);
// }
// }
// ----------------------------------------------------
// ->in a class method name same but number of parameter is also same but return
// type of parameter will be different

// class A {
// // method overloading
// void show(int a) {
// System.out.println(a);
// }

// void show(float a) {
// System.out.println(a);
// }
// }

// public class Main {
// public static void main(String[] args) {
// A p = new A();
// p.show(6.8f);
// p.show(78);
// }
// }
// ------------------------------------------------------
// in a class method name same but parameter also same but first in int and
// second method in byte then what happend ?

// class A {
// // method overloading
// void show(byte a) {
// System.out.println("byte" + a);
// }

// void show(int a) {
// System.out.println("int" + a);
// }
// }

// public class Main {
// public static void main(String[] args) {
// A p = new A();
// p.show(78);
// }
// }

// second point :double float
// class A {
// // method overloading
// void show(float a) {
// System.out.println("float" + a);
// }

// void show(double a) {
// System.out.println("double" + a);
// }
// }

// public class Main {
// public static void main(String[] args) {
// A p = new A();
// p.show(7.8);
// }
// }

// third :int Integer priority ->int
// --------------------------------------------------------------
// ->in a class method name same but number of parameter also same but return
// type of method will be change

// class A {
// // method overloading
// void show(float a) {
// System.out.println("integer" + a);
// }

// int show(int a) {
// System.out.println("int" + a);
// return a;
// }
// }

// public class Main {
// public static void main(String[] args) {
// A p = new A();
// p.show(7);
// }
// }
// --------------------------------------------------------
