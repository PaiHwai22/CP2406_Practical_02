 /*This class declares named constants to represent
 the number of kilometers and miles in a nautical mile. */

public class NauticalMiles {
    public static void main(String[] args) {

        int nautMiles = 8 ; // assigned value to nautical miles.
        double km = 1.852 * nautMiles; // number of km in a nautical mile.
        double miles = 1.105779 * nautMiles; // number of miles in a nautical mile.

        System.out.println("This is the number of nautical miles: " + nautMiles);
        System.out.println(nautMiles + " nautical miles is " + km + " kilometers or " + miles + " miles.");

    }
}
