/**
 * -- TEMPERATURES ABOVE AVERAGE --
 * Author: Steven Norris
 * Date: Jan-21-2025
 * OUTLINE: A simple Java program to demonstrate:
 * 1. Asking the user how many temperature values to enter (n).
 * 2. Reading those n values from the user and storing them in an array.
 * 3. Calculating the average of these values.
 * 4. Counting how many values are above that average.
 * 5. Printing out the results.
 *
 */


package src;
import java.util.Scanner; // Import the Scanner class for reading user inputs


// Main class to execute project's code
public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input the number of temperature values being entered
        // We need an integer 'n' to know how large the array should be
        System.out.print("How many temperatures do you want to enter? ");
        int n = scanner.nextInt();  // read integer input for the number of temperatures and store it in 'n'

        // Array to store the temperature received as
        // We use 'double' to allow for decimal (floating-point) numbers.
        double[] temperatures = new double[n];

        // Acknowledge the previous input and inform user to enter each individual temperature
        System.out.println("Please enter " + n + " temperature values:");
        // We'll store each value in the array at index i
        for (int i = 0; i < n; i++) {
            System.out.print("Temperature " + (i + 1) + ": "); // (i+1) allows to number the temps starting at 1.
            temperatures[i] = scanner.nextDouble();  // Use scanner.nextDouble() to read a floating-point number.
        }

        // Compute the sum of all the temperatures
        double sum = 0;
        // Enhanced for-loop: "for (double temp : temperatures)"
        // means "for each temp in the temperatures array".
        for (double temp : temperatures) {
            sum += temp; // Accumulate the total sum
        }

        // Calculate the average temperature
        // The total sum divided by the number of elements (n).
        double average = sum / n;

        // Count how many temperatures are above the average.
        int countAboveAverage = 0;

        // Loop again through all temperatures to compare each one to 'average'.
        for (double temp : temperatures) {
            if (temp > average) {
                // If a temperature is greater than the average, increment the counter.
                countAboveAverage++;
            }
        }

        // Print the results
        System.out.println();
        System.out.println("Temperatures successfully recorded!"); // Confirmation message
        System.out.println();
        System.out.println("Average temperature is: " + average); // Print out average
        System.out.println(countAboveAverage // Print number of temps above the average
                + " out of " + n
                + " temperatures are above the average.");

        // Close the Scanner to release system resources
        // This is not strictly required here, but a good practice to get in the habit of.
        scanner.close();


    }
}
