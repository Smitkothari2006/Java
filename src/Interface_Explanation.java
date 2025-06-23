/*
 * Java Program to Demonstrate the Use of Interfaces
 * -------------------------------------------------
 * In Java, an **interface** is a reference type, similar to a class,
 * that can contain only constants, method signatures, default methods,
 * static methods, and nested types. Interfaces cannot contain instance fields
 * or constructors.
 *
 * Interfaces are used to achieve **abstraction** and **multiple inheritance** in Java.
 * A class can implement multiple interfaces, making interfaces a powerful tool for building flexible and modular code.
 *
 * This example demonstrates two interfaces: `Bicycle` and `Cycle`.
 * A class `AvonCycle` implements both interfaces, providing concrete definitions
 * for the abstract methods declared in the interfaces.

                        @SuppressWarnings("unused")
*  This annotation tells the compiler (and IDE like IntelliJ) to ignore warnings
*  about unused elements (e.g., methods, fields) in this interface.
*  It's useful when methods are required by design (like in an interface)
*  but are not directly called in this file or project yet.
 */
@SuppressWarnings("unused")
interface Bicycle {
    // Method to increase the speed of the bicycle
    void speedUp(int inc);

    // Method to decrease the speed of the bicycle
    void speedDown(int dec);
}
@SuppressWarnings("unused")
interface Cycle {
    // Method to simulate a horn sound
    void horn();
}

// AvonCycle implements both Bicycle and Cycle interfaces
class AvonCycle implements Bicycle, Cycle {
    int speed = 10; // Initial speed

    // Implementation of speedUp method from Bicycle interface
    public void speedUp(int inc) {
        speed += inc;
        System.out.println("Method of Interface 1 (Bicycle)");
        System.out.println("Increasing Speed: " + speed);
        System.out.println();
    }

    // Implementation of speedDown method from Bicycle interface
    public void speedDown(int dec) {
        speed -= dec;
        System.out.println("Method of Interface 1 (Bicycle)");
        System.out.println("Applying Brakes, Current Speed: " + speed);
        System.out.println();
    }

    // Implementation of horn method from Cycle interface
    public void horn() {
        System.out.println("Side Side Pee Pee");
        System.out.println("From Interface 2 (Cycle)");
        System.out.println();
    }
}

// Main class to execute the program
public class Interface_Explanation {
    public static void main(String[] args) {
        // Create an object of AvonCycle
        AvonCycle cyc = new AvonCycle();

        // Call methods defined in the interfaces
        cyc.speedDown(5); // Reduce speed by 5
        cyc.horn();       // Sound the horn
        cyc.speedUp(5);   // Increase speed by 5
    }
}
