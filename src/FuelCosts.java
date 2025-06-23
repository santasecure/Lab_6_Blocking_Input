import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        // Create scanner and declare variables
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        String trash = "";
        boolean done = false;

        // Get number of gallons with validation loop
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine(); // clear buffer
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said your input was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done);

        // Reset done
        done = false;

        // Get fuel efficiency with validation loop
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine(); // clear buffer
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said your input was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done);

        // Reset done
        done = false;

        // Get price per gallon with validation loop
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine(); // clear buffer
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said your input was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done);

        // Calculate cost to drive 100 miles and max distance
        double costPer100Miles = (100 / mpg) * pricePerGallon;
        double maxDistance = gallons * mpg;

        // Print results using println
        System.out.println("Cost to drive 100 miles: $" + costPer100Miles);
        System.out.println("Distance car can go on full tank: " + maxDistance + " miles");
    }
}

