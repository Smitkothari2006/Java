import java.util.Scanner;

// 1️⃣ Custom thread class using Thread(String name)
class MyThread extends Thread {
    String message;

    // Constructor that uses super() to set thread name
    MyThread(String name, String msg) {
        super(name); // Set thread name
        this.message = msg; // Save user message
    }

    public void run() {
        System.out.println(getName() + " says: " + message);
    }
}

// 2️⃣ Custom Runnable class
class MyRunnable implements Runnable {
    String message;

    MyRunnable(String msg) {
        this.message = msg;
    }

    public void run() {
        // Print message using current thread's name
        System.out.println(Thread.currentThread().getName() + " says: " + message);
    }
}

// 3️⃣ Thread wrapper that uses super(runnable, name)
class RunnableThread extends Thread {
    RunnableThread(Runnable r, String name) {
        super(r, name); // Set task and thread name
    }
}

public class Constructors_ThreadClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for MyThread (extends Thread)
        System.out.print("Enter message for Thread-A (extends Thread): ");
        String msg1 = sc.nextLine();

        System.out.print("Enter message for Thread-B (extends Thread): ");
        String msg2 = sc.nextLine();

        // Input for Runnable-based thread
        System.out.print("Enter message for UserThread-1 (Runnable): ");
        String msg3 = sc.nextLine();

        System.out.print("Enter message for UserThread-2 (Runnable): ");
        String msg4 = sc.nextLine();

        // Creating threads that extend Thread
        MyThread t1 = new MyThread("Thread-A", msg1);
        MyThread t2 = new MyThread("Thread-B", msg2);

        // Creating Runnable tasks
        MyRunnable r1 = new MyRunnable(msg3);
        MyRunnable r2 = new MyRunnable(msg4);

        // Creating threads that use Runnable and set name using super(r, name)
        RunnableThread t3 = new RunnableThread(r1, "UserThread-1");
        RunnableThread t4 = new RunnableThread(r2, "UserThread-2");

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        sc.close();
    }
}
