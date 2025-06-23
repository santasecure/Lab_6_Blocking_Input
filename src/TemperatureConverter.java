
// Convert Fahrenheit to Celsius using a do-while loop to validate input
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Pseudocode: Prompt user for Fahrenheit, validate input with do-while, convert to Celsius, display message
        Scanner in = new Scanner(System.in);
        boolean validInput = false;
        double fahrenheit = 0.0;

        do {
            System.out.print("Enter temperature in Fahrenheit: ");
            if (in.hasNextDouble()) {
                fahrenheit = in.nextDouble();
                validInput = true;
            } else {
                String trash = in.next();
                System.out.println("You must enter a valid number. You entered: \"" + trash + "\"");
            }
        } while (!validInput);

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.1f°F is %.1f°C%n", fahrenheit, celsius);

        if (fahrenheit == 32.0) {
            System.out.println("That's the freezing point of water.");
        } else if (fahrenheit == 212.0) {
            System.out.println("That's the boiling point of water.");
        }
    }
}





