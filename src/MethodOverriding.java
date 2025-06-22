// A simple Java program to demonstrate the concept of method overriding

// Parent class: Phone
class Phone1 {

    // Method to show current time
    public void showTime() {
        System.out.println("Current time is 8am");
    }

    // Method to turn on the phone
    public void turnOn() {
        System.out.println("Turning on Phone");
    }
}

// Child class: SmartPhone inherits from Phone
class SmartPhone1 extends Phone1 {

    // Additional method specific to SmartPhone
    public void music() {
        System.out.println("Playing:- Sapphire Song by Ed Sheeran.");
    }

    // Overriding the turnOn method from the Phone class
    @Override
    public void turnOn() {
        System.out.println("Turning on SmartPhone");
    }
}

// Main class to run the program
public class MethodOverriding {

    public static void main(String[] args) {
        System.out.println("Program to understand concept of method overriding");

        // Creating an object of the subclass SmartPhone
        SmartPhone1 obj = new SmartPhone1();

        // Calling the subclass-specific method
        obj.music();

        // Calling the overridden method
        obj.turnOn(); // This will execute SmartPhone's turnOn, not Phone's
    }
}