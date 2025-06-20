import java.util.Scanner;

public class Methods_Problems_complete {

    public static void MultiplicationTable(int num ){
        for (int i = 0; i <=10 ; i++) {
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }

    public static void Pattern(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void ReversePattern(int n){
        for (int i = 0; i <n; i++) {
            for (int j = i; j <=n-1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static int NaturalNumbers(int n){
        if (n==1){
            return 1;
        }
        else{
            return n+NaturalNumbers(n-1);
        }
    }

    public static int Fibonacci(int n){
        /*
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }*/
        if (n==1||n==2){
            return n-1;
        }
        else {
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number whose Multiplication Table is to be known ");
        int table = scan.nextInt();
        MultiplicationTable( table );

        System.out.println("Enter Number of Rows in pattern ");
        int termPattern = scan.nextInt();
        Pattern(termPattern);

        System.out.println("Enter number of Natural Numbers whose sum is required");
        int NumNatural = scan.nextInt();
        int resultNatural = NaturalNumbers(NumNatural);
        System.out.println("Sum of first  "+NumNatural+" Natural numbers is " + resultNatural);

        System.out.println("Enter Number of Rows in pattern ");
        int termReverse = scan.nextInt();
        ReversePattern(termReverse);

        System.out.println("Enter Nth term to find of Fibonacci series ");
        int termFib = scan.nextInt();
        int resultFib = Fibonacci(termFib);
        System.out.println(termFib +"th Terms of fibonacci series is " + resultFib );



    }
}
