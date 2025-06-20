import java.util.Scanner;

public class Recursion {

    public static int Factorial_Recursion(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * Factorial_Recursion(num - 1);
        }
    }

    public static void Factorial_Iterative(int num) {
        int factorial = 1;
        if (num == 0 || num == 1) {
            System.out.println("Factorial of " + num + " using iteration is 1");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " using iteration is " + factorial);
        }
    }

    public static void main(String[] args) {
        System.out.println("Program to Understand Concept of Recursion using Factorial\n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number whose factorial is to be known: ");
        int num = scan.nextInt();

        int recursiveResult = Factorial_Recursion(num);
        System.out.println("Factorial of " + num + " using recursion is " + recursiveResult);

        Factorial_Iterative(num);
    }
}
