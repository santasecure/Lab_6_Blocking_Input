import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        // Create Scanner and declare variables
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit;
        String trash = "";
        boolean done = false;

        // Prompt for Celsius input using do-while loop
        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine(); // clear buffer
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You must enter a valid number. You entered: \"" + trash + "\"");
            }
        } while (!done);

        // Convert to Fahrenheit
        fahrenheit = (celsius * 9 / 5) + 32;

        // Display results using println
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

        // Check for freezing or boiling point
        if (celsius == 0) {
            System.out.println("That's the freezing point of water.");
        } else if (celsius == 100) {
            System.out.println("That's the boiling point of water.");
        }
    }
}
