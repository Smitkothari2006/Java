/*
 * Demonstration of Abstract Classes in Java
 *
 * Key Points:
 * - An abstract class in Java cannot be instantiated directly.
 * - It can have both abstract methods (without implementation) and concrete methods (with implementation).
 * - Any class extending an abstract class must implement all its abstract methods.
 * - Abstract classes are useful when you want to define a base class with some shared functionality, while forcing child classes to provide specific implementations for certain behaviors.
 */

abstract class Standard {
    String name = "Smit Kothari";

    // Concrete method: has a body and provides common functionality
    public void name() {
        System.out.println("Hello " + name);
    }

    // Abstract method: No body, must be implemented by any subclass
    abstract void greet();
}

// Concrete class that extends the abstract class and provides implementation
class Concrete extends Standard {

    // Providing implementation for the abstract method 'greet'
    @Override
    void greet() {
        System.out.println("Good Morning!");
    }
}

public class Abstract_Class_Example {
    public static void main(String[] args) {
        // Cannot do: Standard std = new Standard(); // This would cause a compile-time error

        // Create an object of the Concrete class
        Concrete con = new Concrete();

        // Call inherited concrete method
        con.name();

        // Call overridden abstract method
        con.greet();
    }
}
