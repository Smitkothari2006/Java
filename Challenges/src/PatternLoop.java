import java.util.Scanner;

public class PatternLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in);
        System.out.println("Enter Number of Rows in the Pattern ");
        int n = scan.nextInt();
        for (int i = n;i>0;i--){
            for (int j = 0;j<i;j++){
                System.out.print("\t*");
            }
            System.out.print('\n');
        }
    }
}
