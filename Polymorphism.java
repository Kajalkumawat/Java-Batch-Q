// constructor overloading :
// ->in a class make multiple constructor then constructor will be overloaded

// class A{
// //constructor overloading
// A(){

// }
// A(){

// }
// }
// public class Polymorphism {
// public static void main(String[] args) {

// }
// }
// ---------------------------------------------------------------
// how to solve this problem :
// in a class make multiple constructor but number of parameters will be
// different

// class A {
// // constructor overloading
// A(int a) {
// System.out.println(a);
// }

// A() {
// System.out.println("constructor calll");
// }
// }

// public class Polymorphism {
// public static void main(String[] args) {
// new A();
// new A(55);
// }
// }
// --------------------------------------------------------------------
// method chaining it is the type of compile time polymorphism

// method chaining :
// ->used for call / refer one method to another method

// this is not the part of method chaining
// class A {
// void m() {
// System.out.println("m method ");
// }

// void n() {
// System.out.println("n methd");
// }

// void p() {
// System.out.println("p method ");
// }

// void k() {
// m();
// n();
// p();
// System.out.println("k method");
// }
// }

// public class Polymorphism {
// public static void main(String[] args) {
// A p = new A();
// p.k();
// }
// }
// ---------------
// this is method chaining

// class A {
// void m() {
// n();
// System.out.println("m method ");
// }

// void n() {
// System.out.println("n method");
// }

// void p() {
// m();
// System.out.println("p method ");
// }

// void k() {
// p();
// System.out.println("k method");
// }
// }

// public class Polymorphism {
// public static void main(String[] args) {
// A p = new A();
// p.k();
// }
// }
// -------------------------------------------------------------
// constructor chaining :
// ->make constructor and call one constructor to another constructor .

// class A {
// A(int a) {
// new A(67.8f);
// System.out.println("int " + a);
// }

// A(float a) {
// System.out.println("float " + a);
// }

// A(int a, int b) {
// new A(23);
// System.out.println("a " + a + " b : " + b);
// }
// }

// public class Polymorphism {
// public static void main(String[] args) {
// new A(3, 4);
// }
// }
// ---------------------------------------------------------------------
// second way :
// class A {
// A(int a) {
// System.out.println("int " + a);
// }

// A(float a) {
// this(12);
// System.out.println("float " + a);
// }

// A(int a, int b) {
// this(3.4f);
// System.out.println("a " + a + " b : " + b);
// }
// }

// public class Polymorphism {
// public static void main(String[] args) {
// new A(3, 4);
// }
// }
// --------------------------------------------------------------------
// class A {
// void show1() {
// System.out.println("show 1 method");
// }
// }

// class B extends A {
// void show2() {
// System.out.println("show2");
// }
// }

// public class Polymorphism {
// public static void main(String[] args) {
// //p :refrence variable not object
// //new B() :constructor call
// A p=new B();
// p.show1();
// p.show2();//error because p is not B class object so does not access child
// class property throgh constructor
// }
// }
// -------------------------------------------------------------
// We are calling the run method by the reference variable of Parent class.
// Since it refers to the subclass object and subclass method overrides the
// Parent class method, the subclass method is invoked at runtime.

// class A {
// void show1() {
// System.out.println("show 1 method");
// }
// }

// class B extends A {
// void show1() {
// System.out.println("show2");
// }
// }

// public class Polymorphism {
// public static void main(String[] args) {
// //p :refrence variable not object
// //new B() :constructor call
// A p=new B();
// p.show1();

// }
// }

// parent class method and child class method name different then make object of
// parent class then does not access child class property

// parent class method and child class method name same then make object of
// parent class then print child class property due to method overriding
// -----------------------------------------
// want to print instance variable value through refrence variable

// class A {
// String name = "hello";
// }

// class B extends A {
// String name = "bye";
// }

// public class Polymorphism {
// public static void main(String[] args) {
// B p = new B();
// System.out.println(p.name);
// }
// }
// ---------------------------------------------------------------------
// Can we overload java main() method?
// yes

// public class Polymorphism {
// public static void main(int a) {
// System.out.println(a);
// }

// public static void main(int a, int b) {
// System.out.println(a + " " + b);
// }

// public static void main(String[] args) {
// Polymorphism k = new Polymorphism();
// k.main(34);
// k.main(12, 57);
// }
// }

// public class Polymorphism {
// public static void main(int a) {
// System.out.println(a);
// }

// public static void main(int a, int b) {
// System.out.println(a + " " + b);
// }

// public static void main(String[] args) {
// Polymorphism k = new Polymorphism();
// k.main(34);
// k.main(12, 57);
// }
// }
