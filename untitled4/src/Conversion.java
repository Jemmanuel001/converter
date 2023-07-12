import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programmer: ");
        System.out.println("Lab 18.4");
        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        double distanceInMeters;
        int choice;
        System.out.print("Enter the distance in meters: ");
        distanceInMeters = scanner.nextDouble();
        do {
            menu();
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showKilometers(distanceInMeters);
                    break;
                case 2:
                    showInches(distanceInMeters);
                    break;
                case 3:
                    showFeet(distanceInMeters);
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid selection.");
                    break;
            }
        } while (choice != 4);
        scanner.close();
    }
    public static void menu() {
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }
    public static void showKilometers(double meters) {
        if (meters >= 0) {
            double kilometers = meters * 0.001;
            System.out.println(meters + " meters is equal to " + kilometers + " kilometers.");
        } else {
            System.out.println("Invalid input. Distance cannot be negative.");
        }
    }
    public static void showInches(double meters) {
        if (meters >= 0) {
            double inches = meters * 39.37;
            System.out.println(meters + " meters is equal to " + inches + " inches.");
        } else {
            System.out.println("Invalid input. Distance cannot be negative.");
        }
    }
    public static void showFeet(double meters) {
        if (meters >= 0) {
            double feet = meters * 3.281;
            System.out.println(meters + " meters is equal to " + feet + " feet.");
        } else {
            System.out.println("Invalid input. Distance cannot be negative.");
        }
    }
}
