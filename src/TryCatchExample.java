import java.util.Scanner;
@SuppressWarnings("unused")
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Ask user to enter two numbers
    System.out.print("Enter first number: ");
    int a = scan.nextInt();

    System.out.print("Enter second number: ");
    int b = scan.nextInt();

//        //Without Try Catch Block
//        double c = a / b;
//        System.out.println("Division Result is " + c);


    // Try to divide the numbers
    try {
        int result = a / b;  // This will cause an error if b is 0
        System.out.println("Result: " + result);
    } catch (Exception e) {
        // This will run if division by zero happens
        System.out.println("You can't divide by zero!\n" + e);
    }

    System.out.println("Program continues...");
    scan.close();
}

