import java.util.Scanner; // import Scanner Class
/* This is an interactive nautical miles class. */
public class NauticalMilesInteractive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number nautical miles: ");
        int nautMiles = Integer.parseInt(scanner.nextLine()); // parse and reads user input

        double km = 1.852 * nautMiles; // number of km in a nautical mile.
        double miles = 1.105779 * nautMiles; // number of miles in a nautical mile.

        System.out.println(nautMiles + " nautical miles is " + km + " kilometers or " + miles + " miles.");

    }
}
