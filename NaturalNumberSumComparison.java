import java.util.Scanner;

// Class to compare recursive and formula-based sum of natural numbers
class NaturalNumberSumComparison {

    // Recursive method to find sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + recursiveSum(n - 1);
    }

    // Method to find sum using formula
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Validate natural number
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number");
        } 
        else {

            // Compute sums
            int recursiveResult = recursiveSum(number);
            int formulaResult = formulaSum(number);

            // Display results
            System.out.println("Sum using recursion: " + recursiveResult);
            System.out.println("Sum using formula: " + formulaResult);

            // Compare results
            if (recursiveResult == formulaResult) {
                System.out.println("Both results are correct and equal.");
            } 
            else {
                System.out.println("Results are not equal.");
            }
        }
    }
}