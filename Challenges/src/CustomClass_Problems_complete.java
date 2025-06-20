import java.util.Scanner;

/* Problem 1
class Employee{
//    int salary;
        String name;
        public void GetSalary(int sal){
//            salary=sal;
            System.out.println("Salary of the Employee is "+sal);
        }
        public void GetName(){
            System.out.println("Name of the employee is "+ name);
        }

        public void SetName(String n){
            name = n;
        }
} */

/* Problem 2
class Square{
    float side;
    public void GetSide(float size){
        side = size;
    }

    public void Area(){
        System.out.println("Area of the Square is "+(side*side));
    }
    public void Perimeter(){
        System.out.println("Perimeter of the Square is "+(side*4));
    }
}*/

/*Problem 3
class Rectangle{
    float Length;
    float Breath;
    public void GetSide(float l,float b){
        Length = l;
        Breath = b;
    }
    public void Area(){
        System.out.println("Area of the Rectangle is "+(Length*Breath));
    }
    public void Perimeter(){
        System.out.println("Perimeter of the Rectangle is "+(2*(Length+Breath)));
    }
}*/

// Problem 4
class Circle{
    float pi = 3.14159265359f;
    float radius;
    public void GetSide(float r){
        radius = r;
    }
    public void Area(){
        System.out.println("Area of the Circle is "+(pi*radius*radius));
    }
    public void Perimeter(){
        System.out.println("Perimeter of the Circle is "+(2*pi*radius));
    }
}


public class CustomClass_Problems_complete {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* Problem 1
        Employee smit=new Employee();
        System.out.println("Enter the salary of the Employee");
        int sal = scan.nextInt();
        scan.nextLine();
        smit.GetSalary(sal);
        System.out.println("Enter the salary of the Employee");
        String name = scan.nextLine();
        smit.SetName(name);
        smit.GetName();
         */


        /* Problem 2
        Square sq1 = new Square();
        System.out.println("Enter the Side of the Square ");
        float size = scan.nextFloat();
        sq1.GetSide(size);
        sq1.Area();
        sq1.Perimeter();*/


        /* Problem 3
        Rectangle rect1 = new Rectangle();
        System.out.println("Enter the Lenght of the Rectangle ");
        float l = scan.nextFloat();
        System.out.println("Enter the Breath of the Rectangle ");
        float b = scan.nextFloat();
        rect1.GetSide(l,b);
        rect1.Area();
        rect1.Perimeter();*/

        //Problem 4
        Circle Cir1 = new Circle();
        System.out.println("Enter the Radius of the Circle ");
        float Radius = scan.nextFloat();
        Cir1.GetSide(Radius);
        Cir1.Area();
        Cir1.Perimeter();


    }
}
