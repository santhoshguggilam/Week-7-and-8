import java.util.Scanner;

// Class to calculate maximum handshakes
class HandshakeCalculator {

    // Method to calculate handshakes using formula n(n-1)/2
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate input
        if (numberOfStudents < 0) {
            System.out.println("Number of students cannot be negative");
        } 
        else {
            // Calculate handshakes
            int totalHandshakes = calculateHandshakes(numberOfStudents);

            // Display result
            System.out.println("The maximum number of handshakes among " +
                    numberOfStudents + " students is " + totalHandshakes);
        }
    }
}