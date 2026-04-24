import java.util.Scanner;

// Class to check whether a number is positive, negative, or zero
class NumberChecker {

    // Method to check number type
    public static int checkNumber(int number) {

        if (number > 0) {
            return 1;   // Positive
        } 
        else if (number < 0) {
            return -1;  // Negative
        } 
        else {
            return 0;   // Zero
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Call method
        int result = checkNumber(number);

        // Display result based on return value
        if (result == 1) {
            System.out.println("The number " + number + " is positive");
        } 
        else if (result == -1) {
            System.out.println("The number " + number + " is negative");
        } 
        else {
            System.out.println("The number is zero");
        }
    }
}