import java.util.Scanner;

// Class to check Leap Year
class LeapYearChecker {

    // Method to check leap year condition
    public static boolean isLeapYear(int year) {

        // Condition: divisible by 4 AND not divisible by 100 OR divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Validate Gregorian calendar year
        if (year < 1582) {
            System.out.println("Year should be >= 1582 (Gregorian calendar)");
        } 
        else {

            // Check leap year using method
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year");
            } 
            else {
                System.out.println(year + " is not a Leap Year");
            }
        }
    }
}