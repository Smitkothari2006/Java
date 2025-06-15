import java.util.Scanner;

public class IfElseIfLadder {
    public static void main (String[] args ){
        System.out.println("Program to Explain If ElseIf Ladder");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Age To check if the person can Drive or Not");
        int age = scan.nextInt();
        if(age>18) {
            System.out.println("Inside If");
            System.out.println("Person can Drive");
        }
        else if (age==18) {
            System.out.println("Inside else if");
            System.out.println("Person can Drive");
        }
        else {
            System.out.println("Inside Else");
            System.out.println("Person Can Not Drive");
        }
    }
}
