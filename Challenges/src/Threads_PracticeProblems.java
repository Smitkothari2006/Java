// Suppress warnings for infinite loop and thread-related best practices
@SuppressWarnings("InfiniteLoopStatement")
class ThreadWelcome extends Thread {

    // The run() method defines the code that runs in the new thread
    @Override
    public void run() {
        while (true) {
            System.out.println("Welcome");

            // Optional: Add delay to slow down output
            /*
            try {
                Thread.sleep(200); // Sleep for 200 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handle interruption
            }
            */
        }
    }
}

@SuppressWarnings("InfiniteLoopStatement")
class ThreadGoodMorning extends Thread {

    // The run() method defines the code that runs in the new thread
    @Override
    public void run() {
        while (true) {
            System.out.println("Good Morning");

            // Optional: Add delay to slow down output
            /*
            try {
                Thread.sleep(200); // Sleep for 200 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handle interruption
            }
            */
        }
    }
}

public class Threads_PracticeProblems {

    // Main method to start the program
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Create instances of both threads
        ThreadWelcome tw = new ThreadWelcome();
        ThreadGoodMorning tgm = new ThreadGoodMorning();

        // Start both threads
        tw.start();
        tgm.start();

        // Set thread priorities:
        // MAX_PRIORITY = 10 (highest), MIN_PRIORITY = 1 (lowest)
        tgm.setPriority(Thread.MAX_PRIORITY);
        tw.setPriority(Thread.MIN_PRIORITY);
    }
}
