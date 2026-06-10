public class Q3{
    public static void main(String[] args) {

        double distanceInKm = 10.8;
        double kilometerPerMile = 1.6;

        double distanceInMiles =
                distanceInKm / kilometerPerMile;

        System.out.println("The distance " +
                distanceInKm +
                " km in miles is " +
                distanceInMiles);
    }
}