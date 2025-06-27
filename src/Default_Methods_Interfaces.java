/*
 ============================================================================
 File: Default_Methods_Interfaces.java

 Purpose:
 Demonstrates:
 - Java Interfaces with abstract, default, and private methods
 - How classes implement multiple interfaces
 - How default methods work and avoid breaking older code
 - How inheritance and interface implementation work together

 Key Concepts:
 - Interfaces can define method signatures (abstract methods)
 - From Java 8 onward, interfaces can include default methods
 - From Java 9 onward, interfaces can include private methods (for reuse within default methods)
 ============================================================================
*/


// Interface representing camera functionality
@SuppressWarnings("unused")
interface Camera {
    void takePhoto();             // Abstract method
    void recordVideo();           // Abstract method
}

// Interface representing Wi-Fi functionality
@SuppressWarnings("unused")
interface Wifi {
    void connectToNetwork(String networkName);  // Abstract method

    // Private method for internal use only (Java 9+)
    private void greetUser() {
        System.out.println("[Wifi] Welcome to the network setup!");
    }

    // Default method with implementation (Java 8+)
    default void startWifiSetup() {
        greetUser();  // Using private helper
        System.out.println("[Wifi] Starting default WiFi configuration...");
    }
}

// Base class representing a basic cell phone
class BasicPhone {
    void receiveCall() {
        System.out.println("[Phone] Incoming call...");
    }

    void makeCall() {
        System.out.println("[Phone] Dialing number...");
    }
}

// SmartPhone class that inherits from BasicPhone and implements Camera and Wi-Fi interfaces
class MySmartPhone extends BasicPhone implements Camera, Wifi {

    // Implementing Wi-Fi interface method
    public void connectToNetwork(String networkName) {
        System.out.println("[SmartPhone] Connecting to network: " + networkName);
    }

    // Implementing Camera interface methods
    public void takePhoto() {
        System.out.println("[SmartPhone] Photo taken!");
    }

    public void recordVideo() {
        System.out.println("[SmartPhone] Recording video in HD...");
    }
}

// Main class to demonstrate functionality
public class Default_Methods_Interfaces {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // Creating a SmartPhone object
        MySmartPhone myPhone = new MySmartPhone();

        // Using inherited methods from BasicPhone
        myPhone.receiveCall();
        myPhone.makeCall();

        // Using implemented methods from Camera
        myPhone.takePhoto();
        myPhone.recordVideo();

        // Using implemented and default methods from Wi-Fi
        myPhone.connectToNetwork("DANGER_Wi-Fi");
        myPhone.startWifiSetup();  // Calls default method which uses private method internally
    }
}
