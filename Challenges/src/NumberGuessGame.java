import java.util.Scanner;
class NumberGuess{
    private final int lower_bound=0;
    private final int upper_bound=100;

    private  final int randomNumber;
    private int guessCount;

    public NumberGuess(){
        randomNumber=(int)(Math.random()*101);
        guessCount=0;
    }

    public void StartGame() {
        Scanner scan = new Scanner(System.in);
        printWelcomeMessage();
//        System.out.println(randomNumber);

        while (true) {
            int guess = guessUser(scan);
            guessCount++;

            if (guess==randomNumber){
                System.out.println("🎉 Congratulations! You guessed the correct number.");
                System.out.println("📊 You guessed it in " + guessCount + " attempts.");
                break;
            } else if (guess<randomNumber) {
                System.out.println("Too low! Try again.");
            }
            else{
                System.out.println("Too high! Try again.");
            }
        }
        System.out.println("Thank you for playing! Goodbye 👋");
    }
    private void printWelcomeMessage(){
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.printf("Try to guess the number between %d and %d.%n", lower_bound, upper_bound);
    }

    private int guessUser(Scanner scan){
        int guess;
        while (true) {
            System.out.printf("Guess the number (%d-%d): ", lower_bound, upper_bound);

            if (!scan.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // discard invalid input
                continue;
            }

            guess = scan.nextInt();

            if (guess < lower_bound || guess > upper_bound) {
                System.out.printf("Please enter a number between %d and %d.%n", lower_bound, upper_bound);
                continue;
            }

            break; // valid guess
        }
        return guess;
    }

}

public class NumberGuessGame {
    public static void main(String[] args) {
        NumberGuess game = new NumberGuess();
        game.StartGame();
    }
}
