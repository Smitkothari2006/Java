
class Employee{
    int id;
    String name;
    float salary;

    //Method to print the details
    public  void PrintDetails(){
        System.out.println("Name - "+ name);
        System.out.println("Id - "+id);
        System.out.println("Salary - "+salary);
    }

}



public class CustomClassDemo {
    public static void main(String[] args) {

        Employee smit = new Employee(); //Object Instantiating

        //Setting Attributes for Smit
        smit.id=1;
        smit.name="Smit Kothari";
        smit.salary=101.01f;

        //Calling Print details Method of the custom class Employee
        smit.PrintDetails();

    }
}
