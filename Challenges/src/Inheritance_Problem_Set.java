import java.util.Scanner;

class Circle1 {
    double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle1 {
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getCurvedArea() {
        return 2 * Math.PI * radius * height;
    }

    public double getTotalArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public double getPerimeter() {
        return 2 * (length + breadth);
    }
}

class Cuboid extends Rectangle {
    double height;

    public Cuboid(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double getLateralArea() {
        return 2 * height * (length + breadth);
    }

    public double getTotalArea() {
        return 2 * ((length * height) + (height * breadth) + (length * breadth));
    }

    public double getVolume() {
        return height * length * breadth;
    }
}

public class Inheritance_Problem_Set {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        menu(scan);
    }

    public static void menu(Scanner scan) {
        System.out.println("Program to Calculate Area, Perimeter, TSA, CSA & Volume of:");
        System.out.println("1. Circle\n2. Cylinder\n3. Rectangle\n4. Cuboid\n5. Menu\n6. Exit");

        while (true) {

        System.out.print("Enter your choice (1-6): ");
        int choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Enter the Radius of the Circle: ");
                    double radius = scan.nextDouble();
                    Circle1 cir = new Circle1(radius);
                    System.out.println("Area of Circle: " + cir.getArea());
                    System.out.println("Circumference of Circle: " + cir.getCircumference());
                    break;
                }
                case 2: {
                    System.out.print("Enter the Radius of the Cylinder: ");
                    double radius = scan.nextDouble();
                    System.out.print("Enter the Height of the Cylinder: ");
                    double height = scan.nextDouble();
                    Cylinder cyl = new Cylinder(radius, height);
                    System.out.println("Total Surface Area of Cylinder: " + cyl.getTotalArea());
                    System.out.println("Curved Surface Area of Cylinder: " + cyl.getCurvedArea());
                    System.out.println("Volume of Cylinder: " + cyl.getVolume());
                    break;
                }
                case 3: {
                    System.out.print("Enter the Length of the Rectangle: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter the Breadth of the Rectangle: ");
                    double breadth = scan.nextDouble();
                    Rectangle rect = new Rectangle(length, breadth);
                    System.out.println("Area of Rectangle: " + rect.getArea());
                    System.out.println("Perimeter of Rectangle: " + rect.getPerimeter());
                    break;
                }
                case 4: {
                    System.out.print("Enter the Length of the Cuboid: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter the Breadth of the Cuboid: ");
                    double breadth = scan.nextDouble();
                    System.out.print("Enter the Height of the Cuboid: ");
                    double height = scan.nextDouble();
                    Cuboid cub = new Cuboid(length, breadth, height);
                    System.out.println("Total Surface Area of Cuboid: " + cub.getTotalArea());
                    System.out.println("Lateral Surface Area of Cuboid: " + cub.getLateralArea());
                    System.out.println("Volume of Cuboid: " + cub.getVolume());
                    break;
                }
                case 5:{
                    System.out.println("1. Circle\n2. Cylinder\n3. Rectangle\n4. Cuboid\n5. Menu\n6. Exit");
//                    menu(scan);
                    break;
                }
                case 6: {
                    System.out.println("Exiting the Program.....");
                    return;
                }
                default: {
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    break;
                }
            }
        }
    }
}
