import java.util.Scanner;

public class MethodsJava {
    static void sum(float x, float y){
        if(x>y){
            System.out.println("Num1 is greater sum = a+b");
            System.out.println(x+y);
        }
        else{
            System.out.println("Num2 is greater sum = (a+b)*5");
            System.out.println((x+y)*5);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Program To find Sum of 2 number\nCase 1. If num1 is greater( sum = a+b )\nCase 2. If num2 is greater( sum = (a+b)*5 )");
        System.out.println("Enter num 1 ");
        float num1 = scan.nextFloat();

        System.out.println("Enter num  2");
        float num2 = scan.nextFloat();

//        normal way without object calling the method
        sum(num1,num2);

//        Creating object and calling the method
        MethodsJava obj = new MethodsJava();
        obj.sum(num1,num2);
    }
}
