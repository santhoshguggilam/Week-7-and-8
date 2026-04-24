import java.util.Scanner;

// Class to find factors and perform calculations
class FactorAnalysis {

    // Method to count factors
    public static int countFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    // Method to find factors and store in array
    public static int[] findFactors(int number) {

        int size = countFactors(number);
        int[] factors = new int[size];

        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to calculate sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int value : factors) {
            sum += value;
        }
        return sum;
    }

    // Method to calculate product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int value : factors) {
            product *= value;
        }
        return product;
    }

    // Method to calculate sum of squares of factors
    public static double sumOfSquareOfFactors(int[] factors) {
        double sum = 0;
        for (int value : factors) {
            sum += Math.pow(value, 2);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Get factors array
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors are: ");
        for (int value : factors) {
            System.out.print(value + " ");
        }

        // Calculations
        int sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        double sumSquare = sumOfSquareOfFactors(factors);

        // Display results
        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumSquare);
    }
}