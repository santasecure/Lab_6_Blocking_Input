import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        // Pseudocode: Prompt user for Celsius input → convert to Fahrenheit → print result and handle freezing/boiling
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        double celsius = 0;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                valid = true;
            } else {
                String badInput = scanner.next();
                System.out.println("You must enter a valid number. You entered: \"" + badInput + "\"");
            }
        } while (!valid);

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.1f°C is %.1f°F%n", celsius, fahrenheit);

        if (celsius == 0) {
            System.out.println("That's the freezing point of water.");
        } else if (celsius == 100) {
            System.out.println("That's the boiling point of water.");
        }
    }
}


