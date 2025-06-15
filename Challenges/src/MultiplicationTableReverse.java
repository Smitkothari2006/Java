import java.util.Scanner;

public class MultiplicationTableReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Whose table Need to be found in Reverse order ");
        int num = scan.nextInt();
        for (int i = 10; i > 0; i--) {
            int c = num * i;
            System.out.println(num + " x " + i + " = " + c);
        }
    }
}