/*
 * Demonstration of Constructor Overloading in Java
 * -> Constructors have the same name as the class.
 * -> Constructors can be overloaded just like methods.
 */

class Sum {

    // Default constructor
    public Sum() {
        System.out.println("Program to Sum Numbers");
    }

    // Constructor with one parameter
    public Sum(int a) {
        System.out.println("Sum is " + a);
    }

    // Constructor with two parameters
    public Sum(int a, int b) {
        System.out.println("Sum is " + (a + b));
    }

    // Constructor with three parameters
    public Sum(int a, int b, int c) {
        System.out.println("Sum is " + (a + b + c));
    }

    // Constructor with four parameters
    public Sum(int a, int b, int c, int d) {
        System.out.println("Sum is " + (a + b + c + d));
    }
}

public class Constructors_and_Overloading {
        public static void main(String[] args) {
            new Sum();                     // Calls default constructor
            new Sum(5);                    // Constructor with 1 parameter
            new Sum(5, 5);                 // Constructor with 2 parameters
            new Sum(5, 5, 5);              // Constructor with 3 parameters
            new Sum(5, 5, 5, 5);           // Constructor with 4 parameters
        }
    }
