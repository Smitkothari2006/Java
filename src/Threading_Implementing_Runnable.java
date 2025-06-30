// Demonstrates multithreading using the Runnable interface

// Class implementing Runnable to define thread logic
class Class_P implements Runnable {
    public void run() {
        // Print message 11 times to simulate thread execution
        for (int i = 0; i <= 10; i++) {
            System.out.println("I am Thread 1");
        }
    }
}

// Another class implementing Runnable
class Class_Q implements Runnable {
    public void run() {
        // Print message 8 times
        for (int i = 0; i <= 7; i++) {
            System.out.println("I am Thread 2");
        }
    }
}

public class Threading_Implementing_Runnable {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Create instances of Runnable classes
        Class_P thr1 = new Class_P();
        Class_Q thr2 = new Class_Q();

        // Create Thread objects, passing Runnable instances
        Thread th1 = new Thread(thr1);
        Thread th2 = new Thread(thr2);

        // Start the threads
        th1.start();
        th2.start();
    }
}
