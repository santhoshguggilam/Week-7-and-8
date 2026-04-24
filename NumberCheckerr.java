import java.util.Scanner;

// Utility class for number operations
class NumberCheckerr {

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;

        while (number != 0) {
            count++;
            number = number / 10;
        }

        return count;
    }

    // Method to store digits in array
    public static int[] getDigits(int number) {

        int size = countDigits(number);
        int[] digits = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }

        return digits;
    }

    // Method to check Duck number
    public static boolean isDuckNumber(int[] digits) {

        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check Armstrong number
    public static boolean isArmstrongNumber(int number, int[] digits) {

        int power = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }

        return sum == number;
    }

    // Method to find largest and second largest
    public static int[] findLargestTwo(int[] digits) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } 
            else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest
    public static int[] findSmallestTwo(int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {

            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } 
            else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Get digits array
        int[] digits = getDigits(number);

        // Display digits
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        // Duck number check
        System.out.println("\nIs Duck Number? " + isDuckNumber(digits));

        // Armstrong number check
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(number, digits));

        // Largest and second largest
        int[] largestTwo = findLargestTwo(digits);
        System.out.println("Largest digit: " + largestTwo[0]);
        System.out.println("Second largest digit: " + largestTwo[1]);

        // Smallest and second smallest
        int[] smallestTwo = findSmallestTwo(digits);
        System.out.println("Smallest digit: " + smallestTwo[0]);
        System.out.println("Second smallest digit: " + smallestTwo[1]);
    }
}