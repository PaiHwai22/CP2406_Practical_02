/* This class declares a named constant to hold the number of quarts in a gallon.
* */
public class QuartsToGallons {
    public static void main(String[] args) {
        int quart = 4;
        int paintJob = 18; // named constant
        int quotient = paintJob / quart; // gets gallons
        int remainder = paintJob % quart; // gets quart

        // a painting job requires 18 quarts.
        System.out.println("A paint job requires " + paintJob + " quarts. ");
        // a job that needs 18 quarts requires 4 gallons plus 2 quarts.
        System.out.println("A job that needs 18 quarts requires " + quotient +
                " gallons plus " + remainder + " quarts.");
    }
}
