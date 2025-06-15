import java.util.Scanner;

/* Write a program to find out weather a student is pass or fail
if it requires total 40% and at least 33% in each subject to pass
Assume 3 Subjects and take marks as input from the user */
public class ifelse_problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Marks for Subject 1");
        float m1 = scan.nextFloat();
        System.out.println("Enter Marks for Subject 2");
        float m2 = scan.nextFloat();
        System.out.println("Enter Marks for Subject 3");
        float m3 = scan.nextFloat();

        float average = (m1+m2+m3)/3;
        System.out.println("Your Overall percentage is "+average+"%");
        if (average>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations Student has been promoted!!");
        }
        else{
            System.out.println("Sorry Student is Fail!!");
        }
    }
}
