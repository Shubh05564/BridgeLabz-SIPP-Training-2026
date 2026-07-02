import java.util.ArrayList;
import java.util.Scanner;

public class SmartParkingSlotManager {

    public static void main(String[] args) {

        ArrayList<String> parking = new ArrayList<>();

        try (Scanner sc = new Scanner(System.in)) {

            int choice;

            do {
                System.out.println("\n===== Smart Parking Slot Manager =====");
                System.out.println("1. Add Vehicle");
                System.out.println("2. Remove Vehicle");
                System.out.println("3. Search Vehicle");
                System.out.println("4. Display All Vehicles");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();
                sc.nextLine(); // Consume newline

                switch (choice) {

                    case 1:
                        System.out.print("Enter Vehicle Registration Number: ");
                        String addVehicle = sc.nextLine();

                        parking.add(addVehicle);
                        System.out.println("Vehicle Added Successfully.");
                        break;

                    case 2:
                        System.out.print("Enter Vehicle Registration Number: ");
                        String removeVehicle = sc.nextLine();

                        if (parking.remove(removeVehicle)) {
                            System.out.println("Vehicle Removed Successfully.");
                        } else {
                            System.out.println("Vehicle Not Found.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Vehicle Registration Number: ");
                        String searchVehicle = sc.nextLine();

                        if (parking.contains(searchVehicle)) {
                            System.out.println("Vehicle is Currently Parked.");
                        } else {
                            System.out.println("Vehicle is Not Parked.");
                        }
                        break;

                    case 4:
                        System.out.println("\n===== Parked Vehicles =====");

                        if (parking.isEmpty()) {
                            System.out.println("No Vehicles Parked.");
                        } else {
                            for (String vehicle : parking) {
                                System.out.println(vehicle);
                            }
                        }

                        System.out.println("Total Occupied Parking Slots: " + parking.size());
                        break;

                    case 5:
                        System.out.println("Thank You! Exiting...");
                        break;

                    default:
                        System.out.println("Invalid Choice! Please Try Again.");
                }

            } while (choice != 5);
        }
    }
}    