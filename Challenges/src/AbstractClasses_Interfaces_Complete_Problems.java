/*
    Practice Set - Abstract Classes, Inheritance, Interfaces, and Polymorphism

    Q1: Create an abstract class "Pen" with abstract methods write() and refill().
    Q2: Create a class "FountainPen" that extends "Pen" and includes an additional method changeNib().
    Q3: Create a class "Monkey" with methods jump() and Bite(). Create an interface "BasicAnimal" with methods eat() and sleep().
        Then create a class "Human" that inherits from Monkey and implements BasicAnimal. Demonstrate calling all methods.
    Q4: Create an abstract class "TelePhone" with abstract methods ring(), lift(), and disconnect().
        Create a class "SmartTelePhone" that extends "TelePhone" and implements all methods. Try calling openGps() on a TelePhone reference.
    Q5: Demonstrate polymorphism by creating a Monkey reference to a Human object.
        Try calling methods accessible via the Monkey reference.
*/

// Q1: Abstract class Pen with abstract methods
@SuppressWarnings("unused")
abstract class Pen {
    abstract void write();   // Method to be implemented for writing

    abstract void refill();  // Method to be implemented for refilling
}

// Q2: FountainPen extends Pen and adds a custom method
class FountainPen extends Pen {
    public void write() {
        System.out.println("Writing...");
    }

    public void refill() {
        System.out.println("Refilling...");
    }

    public void changeNib() {
        System.out.println("Change the Nib"); // Custom method of FountainPen
    }
}

// Q4: Abstract class TelePhone
@SuppressWarnings("unused")
abstract class TelePhone {
    abstract void ring();       // Abstract method for ringing

    abstract void lift();       // Abstract method for lifting a call

    abstract void disconnect(); // Abstract method for disconnecting a call
}

// SmartTelePhone implements all methods of TelePhone and adds its own method
@SuppressWarnings("unused")
class SmartTelePhone extends TelePhone {
    public void ring() {
        System.out.println("Ring Ring !!!!");
    }

    public void lift() {
        System.out.println("Lift Lift !!!!");
    }

    public void disconnect() {
        System.out.println("Tata Bye Bye !!!!");
    }

    void openGps() {
        System.out.println("Opening the MAPS.."); // Custom method
    }
}

// Q3: Class Monkey with basic animal-like behavior
class Monkey {
    public void jump() {
        System.out.println("....Jump Jump Jumping....");
    }

    public void Bite() {
        System.out.println("....Bite Bite Biting....");
    }
}

// Interface with animal behavior methods
@SuppressWarnings("unused")
interface BasicAnimal {
    void eat();   // Method to eat

    void sleep(); // Method to sleep
}

// Human extends Monkey and implements BasicAnimal
class Human extends Monkey implements BasicAnimal {
    public void eat() {
        System.out.println("....Yummy Tasty....");
    }

    public void sleep() {
        System.out.println("....Sleeping....");
    }
}

// Main class to test everything
public class AbstractClasses_Interfaces_Complete_Problems {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // Q1 + Q2: Create a FountainPen and use its methods
        System.out.println("Question 1 & 2");
        FountainPen pen = new FountainPen();
        pen.changeNib();  // Custom method
        pen.write();      // Implemented abstract method
        pen.refill();     // Implemented abstract method
        System.out.println();

        // Q3: Create Human and call all methods from Monkey and BasicAnimal
        System.out.println("Question 3");
        Human you = new Human();
        you.Bite();   // Inherited from Monkey
        you.jump();   // Inherited from Monkey
        you.eat();    // From BasicAnimal interface
        you.sleep();  // From BasicAnimal interface
        System.out.println();

        // Q4: Using polymorphism with abstract class reference
        System.out.println("Question 4");
        TelePhone t = new SmartTelePhone();  // Reference of type TelePhone
        // t.openGps(); // Not allowed: method not in TelePhone class
        t.lift();  // Calls SmartTelePhone's lift() implementation
        System.out.println();

        // Q5: Polymorphism with Monkey reference to Human object
        System.out.println("Question 5");
        Monkey mon = new Human();  // Monkey reference to a Human object
        mon.Bite();                // Allowed: method in Monkey
        mon.jump();                // Allowed: method in Monkey
        // mon.eat(); // Not allowed: method not in Monkey class
        System.out.println();
    }
}
