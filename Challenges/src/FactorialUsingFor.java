import java.util.Scanner;

public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number Whose Factorial needs to be found ");
        int num = scan.nextInt();
        int fact = 1;
        for(int i = 1;i<=num;i++){
            fact = fact * i ;
        }
        System.out.println("Fcatorial of "+num+" is "+fact);
    }
}
