import java.util.Scanner;

public class PercentCalculator {
    public static void main(String[] args) {
        System.out.println("Program to Calculate Percentage of students for 5 subjects taking marks of 5 subject as input from the user");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Maximum Marks (out of 100 or 80 etc) ");
        float maxMarks = scan.nextFloat();

        System.out.println("Enter Marks for subject 1:- ");
        float subMarks1 = scan.nextFloat();
        System.out.println("Enter Marks for subject 2:- ");
        float subMarks2 = scan.nextFloat();
        System.out.println("Enter Marks for subject 3:- ");
        float subMarks3 = scan.nextFloat();
        System.out.println("Enter Marks for subject 4:- ");
        float subMarks4 = scan.nextFloat();
        System.out.println("Enter Marks for subject 5:- ");
        float subMarks5 = scan.nextFloat();

        float average = (subMarks1+subMarks2+subMarks3+subMarks4+subMarks5)/(maxMarks*5);
        float percent = average*100;

        System.out.println("Percentage of the Student is " + percent );

        scan.close();

    }
}
