import java.util.Scanner;
/*  *******************************  Notes  *********************************************
Methods Overloading means 2 or more Methods with same name but different number of parameters
Methods can be overloaded only if we add or remove the parameters
and not by changing the datatype
 */
public class MethodOverloading {
    static int Sum(int a){
        a=a+5;
        return a;
    }

    static int Sum(int a,int b){

        return a+b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Num 1 = ");
        int num1 = scan.nextInt();
        System.out.println("Enter Num 2 = ");
        int num2 = scan.nextInt();


        //Method Sum with 1 parameter
        int result= Sum(num1);
        System.out.println("Sum method with one Parameter +5 = "+ result);
        

        //Method Sum with 2 parameter
        int result1= Sum(num1,num2);
        System.out.println("Sum method with 2 prameters a+b = "+ result1);
    }
}
