import java.util.Scanner;

class Private{
    private int id;
    private String name;

   //Setter
    public void SetName(String n){
        name =n;
    }

    //Getter
    public void GetName(){
        System.out.println("Name is "+name);
    }

    //Setter
    public void SetId(int i){
        id =i;
    }

    //Getter
    public void GetId(){
        System.out.println("Id is "+id);
    }
}
public class PrivateAccessModifiers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Name of the Employee");
        String n = scan.nextLine();
        System.out.println("Enter the ID of the Employee");
        int i= scan.nextInt();

        Private xyz = new Private();
        xyz.SetName(n);
        xyz.SetId(i);
        xyz.GetName();
        xyz.GetId();
    }
}
