import java.util.Scanner;
class Library{
    int add;
    String [] books = new String[100];
    int bookCount=0;
    public void addBooks(Scanner scan){
        System.out.println("How many Books do you want to add ");
        add = scan.nextInt();
        scan.nextLine();
        if ((add+bookCount)>books.length){
            System.out.println("Invalid Space");
        }
        else {
            for (int i = 0; i <add; i++) {
                System.out.println("Enter the name of the Book");
                books[bookCount]= scan.nextLine();
                bookCount++;
            }
            System.out.println("Books Added successfully");
        }
    }

    public void issueBooks(Scanner scan){
        showAvailableBooks();
        System.out.println("Enter the number of Book you want to issue (max 2)");
        int num=scan.nextInt();
        if (num>2){
            System.out.println("You can issue 2 books at a time only ");
            return;
        }

        for (int i = 0; i <num; i++) {
            System.out.println("Enter the book number you want to issue:");
            int bookNum = scan.nextInt();
            if (bookNum<1 ||bookNum>books.length||books[bookNum-1]==null){
                System.out.println("Invalid book number or book already issued.");
            }
            else{
                System.out.println("Book Issued: " + books[bookNum - 1]);
                books[bookNum - 1] = null;
                bookCount--;

            }
        }
    }

    public void returnBooks(Scanner scan){
        System.out.println("Enter the name of the book you want to return");
        scan.nextLine();
        String returnedBook=scan.nextLine();
        boolean flag = false;
        for (int i = 0; i < books.length; i++) {
            if(books[i]==null){
                books[i] = returnedBook;
                bookCount++;
                flag=true;
                System.out.println("Book returned successfully.");
                break;
            }
        }
        if (!flag){
            System.out.println("Library is full. Cannot accept returned book.");
        }
    }

    public void showAvailableBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println("Book " + (i + 1) + ": " + books[i]);
            }
        }
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        menu();
        Scanner scan = new Scanner(System.in);
        Library lib = new Library();
        while(true){
            System.out.println("Enter your choice (5 - for menu)");
            int choice=scan.nextInt();
            switch (choice){
                case 1: {
                    lib.addBooks(scan);
                    break;
                }
                case 2: {
                    lib.issueBooks(scan);
                    break;
                }
                case 3: {
                    lib.returnBooks(scan);
                    break;
                }
                case 4: {
                    lib.showAvailableBooks();
                    break;
                }
                case 5: {
                    menu();
                    break;
                }
                case 6:{
                    System.out.println("Exiting the Program");
                    return;
                }
                default:{
                    System.out.println("Enter a valid Choice");
                    break;
                }

            }
        }
    }
    public static void menu(){
        System.out.println("Welcome to library Management Software ");
        System.out.println("Enter the choice number to perform the Operation ");
        System.out.println("1. Add Books");
        System.out.println("2. Issue Books");
        System.out.println("3. Return Books");
        System.out.println("4. Show Available Books");
        System.out.println("5. Show Menu");
        System.out.println("6. Exit");
    }
}
