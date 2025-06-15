import java.util.Scanner;
//Program to find sum of N even Numbers
public class SumEvenNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N to find the sum of even number ");
        int n=scan.nextInt();
        int sum=0;
        int i = 0;
        while(i<n){
            sum+=(2*i);
            i++;
        }
        System.out.println("Sum of Even Numbers is "+sum);
    }
}
