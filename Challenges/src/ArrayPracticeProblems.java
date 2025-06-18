import java.util.Scanner;

public class ArrayPracticeProblems {
    public static void main(String[] args) {
        float[] sum = new float[5];
        Scanner scan = new Scanner(System.in);


        //Loop to take input from the user and store it in the array
        for (int i = 0; i < sum.length; i++) {
        System.out.println("Enter number "+(i+1));
        sum[i]= scan.nextFloat();
        }

        float total=0;

        //for - each loop to find the sum of array
        for (float v : sum) {
            total = total + v;
        }

        //print the total
        System.out.println("Sum of 5 float number is "+total);

    }
}
