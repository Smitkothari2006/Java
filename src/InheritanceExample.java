// ====================
// Base Class: Vehicle
// ====================
class Vehicle {
    // Common properties for all vehicles
    int wheels;         // Number of wheels (e.g., 4 for car, 6 for truck)
    String color;       // Color of the vehicle
    String brand;       // Brand of the vehicle

    // Setters: to set the values of properties
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getters: to get the values of properties
    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}

// =====================
// Derived Class: Car
// Inherits from Vehicle
// =====================
class Car extends Vehicle {
    // Specific properties only for Car
    int seats;                 // Number of seats
    boolean hasAirConditioner; // Does it have an AC?

    // Setters
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setHasAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
    }

    // Getters
    public int getSeats() {
        return seats;
    }

    public boolean isHasAirConditioner() {
        return hasAirConditioner;
    }
}

// =====================
// Derived Class: Truck
// Inherits from Vehicle
// =====================
class Truck extends Vehicle {
    // Specific properties only for Truck
    int tyres;               // Number of tyres
    double loadCapacity;     // Load capacity in tons

    // Setters
    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    // Getters
    public int getTyres() {
        return tyres;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }
}

// =========================
// Main class with main method
// =========================
public class InheritanceExample {
    public static void main(String[] args) {

        // -----------------------------
        // Creating a Car object
        // -----------------------------
        Car myCar = new Car();

        // Setting values from base class (Vehicle)
        myCar.setWheels(4);
        myCar.setColor("Red");
        myCar.setBrand("Toyota");

        // Setting values from derived class (Car)
        myCar.setSeats(5);
        myCar.setHasAirConditioner(true);

        // Display Car details
        System.out.println("=== Car Details ===");
        System.out.println("Brand: " + myCar.getBrand());             // from Vehicle
        System.out.println("Color: " + myCar.getColor());             // from Vehicle
        System.out.println("Wheels: " + myCar.getWheels());           // from Vehicle
        System.out.println("Seats: " + myCar.getSeats());             // from Car
        System.out.println("Air Conditioner: " +
                (myCar.isHasAirConditioner() ? "Yes" : "No"));            // from Car

        // -----------------------------
        // Creating a Truck object
        // -----------------------------
        Truck myTruck = new Truck();

        // Setting values from base class (Vehicle)
        myTruck.setWheels(6);
        myTruck.setColor("Blue");
        myTruck.setBrand("Volvo");

        // Setting values from derived class (Truck)
        myTruck.setTyres(10);
        myTruck.setLoadCapacity(15.5);  // 15.5 tons

        // Display Truck details
        System.out.println("\n=== Truck Details ===");
        System.out.println("Brand: " + myTruck.getBrand());           // from Vehicle
        System.out.println("Color: " + myTruck.getColor());           // from Vehicle
        System.out.println("Wheels: " + myTruck.getWheels());         // from Vehicle
        System.out.println("Tyres: " + myTruck.getTyres());           // from Truck
        System.out.println("Load Capacity: " + myTruck.getLoadCapacity() + " tons"); // from Truck
    }
}