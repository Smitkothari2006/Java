import java.util.Scanner;
public class CgpaCalculator {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                // Take input for 3 subjects
                System.out.print("Enter marks for Subject 1 (out of 100): ");
                double marks1 = scan.nextDouble();

                System.out.print("Enter marks for Subject 2 (out of 100): ");
                double marks2 = scan.nextDouble();

                System.out.print("Enter marks for Subject 3 (out of 100): ");
                double marks3 = scan.nextDouble();

                // Convert marks to grade points (out of 10)
                double gradePoint1 = marks1 / 10;
                double gradePoint2 = marks2 / 10;
                double gradePoint3 = marks3 / 10;

                // Calculate CGPA
                double cgpa = (gradePoint1 + gradePoint2 + gradePoint3) / 3;

                // Output result
                System.out.printf("Your CGPA is: %.2f%n", cgpa);

                scan.close();
    }
}
