// Demonstrates multithreading by extending the Thread class
class A extends Thread {
    public void run() {
        // Loop to simulate work done by Thread A
        for (int i = 1; i <= 5; i++) {
            System.out.println("\t From ThreadA: i= " + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        // Loop to simulate work done by Thread B
        for (int j = 1; j <= 5; j++) {
            System.out.println("\t From ThreadB: j= " + j);
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread {
    public void run() {
        // Loop to simulate work done by Thread C
        for (int k = 1; k <= 5; k++) {
            System.out.println("\t From ThreadC: k= " + k);
        }
        System.out.println("Exit from C");
    }
}

public class MultiThreading_3Threads {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Creating and starting three threads
        new A().start(); // Thread A starts
        new B().start(); // Thread B starts
        new C().start(); // Thread C starts
    }
}
