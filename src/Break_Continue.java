public class Break_Continue {
    public static void main(String[] args) {
                // === Example 1: Using 'break' ===
                System.out.println("Example with 'break':");
                for (int i = 1; i <= 10; i++) {
                    if (i == 5) {
                        System.out.println("Breaking the loop at i = " + i);
                        break; // Exits the loop when i is 5
                    }
                    System.out.println("i = " + i);
                }
                System.out.println("End of 'break' example.\n");



        // === Example 2: Using 'continue' ===
        System.out.println("Example with 'continue':");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Skipping i = " + i);
                continue; // Skips the rest of the loop when i is 5
            }
            System.out.println("i = " + i);
        }
        System.out.println("End of 'continue' example.");


    }
}
