// A simple Java program to demonstrate the concept of method overriding
// and dynamic method dispatch (runtime polymorphism)

// Parent class : Phone
class Phone {

    // Method to show current time
    public void showTime() {
        System.out.println("Current time is 8 AM");
    }

    // Method to turn on the phone
    public void turnOn() {
        System.out.println("Turning on Phone");
    }
}

// Child class: SmartPhone inherits from Phone
class SmartPhone extends Phone {

    // Method specific to SmartPhone
    public void music() {
        System.out.println("Playing: Sapphire Song by Ed Sheeran.");
    }

    // Overriding the turnOn method from the Phone class
    @Override
    public void turnOn() {
        System.out.println("Turning on SmartPhone");
    }
}

// Main class to demonstrate dynamic method dispatch
public class DynamicMethodDispatch {
    public static void main(String[] args) {

        // Dynamic method dispatch:
        // Reference of parent class (Phone) points to an object of child class (SmartPhone)
        Phone obj = new SmartPhone();

        // Although the reference is of type Phone, the actual object is SmartPhone
        // Method call is resolved at runtime based on the actual object type (SmartPhone)

        obj.showTime();   // Calls the showTime method from Phone class (no override)

        obj.turnOn();     // Calls the overridden turnOn method from SmartPhone class

        // obj.music();   // This line would cause a compile-time error because
        // the reference type is Phone, and music() is not defined in Phone
    }
}
