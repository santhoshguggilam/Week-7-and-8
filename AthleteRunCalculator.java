import java.util.Scanner;

// Class to calculate number of rounds in a triangular park
class AthleteRunCalculator {

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {

        double perimeter = side1 + side2 + side3;

        // 5 km = 5000 meters
        double totalDistance = 5000;

        return totalDistance / perimeter;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for triangle sides
        System.out.print("Enter side 1 in meters: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 in meters: ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 in meters: ");
        double side3 = input.nextDouble();

        // Calculate rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Display result
        System.out.println("The athlete needs to run " + rounds +
                " rounds to complete 5 km run.");
    }
}