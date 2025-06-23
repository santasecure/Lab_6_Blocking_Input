import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        // Create Scanner and declare variables
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double area, perimeter, diagonal;
        String trash = "";
        boolean done = false;

        // Get width of rectangle with input validation
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine(); // clear the buffer
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said your input was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done);

        // Reset done flag for next input
        done = false;

        // Get height of rectangle with input validation
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine(); // clear the buffer
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said your input was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done);

        // Calculate area, perimeter, and diagonal
        area = width * height;
        perimeter = 2 * (width + height);
        diagonal = Math.sqrt((width * width) + (height * height));

        // Display results using println (not printf)
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}




