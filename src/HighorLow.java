import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        // Create Scanner and Random objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // Generate random number between 1 and 10
        int secretNumber = rand.nextInt(10) + 1;
        int guess = 0;
        String trash = "";
        boolean done = false;

        // Prompt user for guess with input validation
        do {
            System.out.print("Guess the number (1 to 10): ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine(); // clear buffer
                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("The number must be between 1 and 10.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said your input was: " + trash);
                System.out.println("You have to enter a whole number between 1 and 10!");
            }
        } while (!done);

        // Display random number
        System.out.println("The number was: " + secretNumber);

        // Compare guess to actual number
        if (guess < secretNumber) {
            System.out.println("Your guess was too low.");
        } else if (guess > secretNumber) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("You got it! On the money!");
        }
    }
}
