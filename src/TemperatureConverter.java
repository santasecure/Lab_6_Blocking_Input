//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Pseudocode: Prompt user for temperature in Fahrenheit, convert to Celsius, then display result.

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Prompt the user for Fahrenheit temperature
        System.out.print("Enter temperature in Fahrenheit: ");

        // Read user input
        double fahrenheitTemp = inputScanner.nextDouble();

        // Convert to Celsius
        double celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;

        // Output result
        System.out.println("The equivalent temperature in Celsius is: " + celsiusTemp);
    }
}
