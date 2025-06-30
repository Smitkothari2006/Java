// Demonstrates multithreading by extending the Thread class directly

// Class extending Thread
class Class_ABC extends Thread {
    public void run() {
        // Print message 11 times to simulate work
        for (int i = 0; i <= 10; i++) {
            System.out.println("I am Thread 1");
        }
    }
}

// Another class extending Thread
class Class_XYZ extends Thread {
    public void run() {
        // Print message 8 times
        for (int i = 0; i <= 7; i++) {
            System.out.println("I am Thread 2");
        }
    }
}

public class Threading_Extending_ThreadClass {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Create thread instances
        Class_ABC thr1 = new Class_ABC();
        Class_XYZ thr2 = new Class_XYZ();

        // Start the threads
        thr1.start();
        thr2.start();
    }
}
