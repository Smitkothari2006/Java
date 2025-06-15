import java.util.Scanner;

/*Calculate the tax paid by an employee to the government as per the slabs mentioned bellow
        Income Slab            Tax
        2.5L-5L                 5%
        5L-10L                  20%
        10L+++                  30%
               ***** no tax bellow 2.5L *****
take input amount as input from the user */

public class ifelse_problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        double income = scan.nextDouble();
        double tax = 0;

        if (income <= 250000) {
            tax = 0;
        }
        else if (income > 250000 && income <= 500000) {
            tax = (income - 250000) * 0.05;
        }
        else if (income > 500000 && income <= 1000000) {
            tax = (250000 * 0.05) + ((income - 500000) * 0.20);
        }
        else {
            tax = (250000 * 0.05) + (500000 * 0.20) + ((income - 1000000) * 0.30);
        }

        System.out.println("Tax to be paid: ₹" + tax);
        scan.close();
    }
}
