import java.util.Scanner;
// Multiplication of N number
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Whose table Need to be found");
        int num = scan.nextInt();
        for(int i =1;i<11;i++){
            int c = num*i;
            System.out.println( num +" x "+ i +" = "+ c);
        }
    }
}
