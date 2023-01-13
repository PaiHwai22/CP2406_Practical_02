import java.util.Scanner; // Import Scanner class
/*This is an interactive QuartsToGallons class where user gives the number of quarts. */
public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of quarts for paint job: ");

        int paintJob = Integer.parseInt(scanner.nextLine()); // reads user input

        int quart = 4; // quarts per gallon
        int quotient = paintJob / quart; // gets gallons
        int remainder = paintJob % quart; // gets quart

        // a painting job requires 18 quarts.
        System.out.println("A paint job requires " + paintJob + " quarts. ");
        // a job that needs 18 quarts requires 4 gallons plus 2 quarts.
        System.out.println("A job that needs 18 quarts requires " + quotient +
                " gallons plus " + remainder + " quarts.");
    }
}
