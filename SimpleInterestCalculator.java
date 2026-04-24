import java.util.Scanner;

// Class to calculate Simple Interest using a method
class SimpleInterestCalculator {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time: ");
        double time = input.nextDouble();

        // Call method to calculate simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Display result
        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}