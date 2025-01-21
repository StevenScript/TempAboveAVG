package src;

import java.util.Scanner; // Import the Scanner class for reading user inputs

// Main class to execute project's code
public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input the number of temperature values being entered
        System.out.print("How many temperatures do you want to enter? ");
        int n = scanner.nextInt();  // read integer input for the number of temperatures

        // Array to store the temperature received as
        double[] temperatures = new double[n];

        // Acknowledge the previous input and inform user to enter each individual temperature
        System.out.println("Please enter " + n + " temperature values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Temperature " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();  // Store each input
        }

        // Compute the sum of all the temperatures
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp; // Accumulate the total sum
        }

        // Calculate the average temperature
        double average = sum / n;

        // Print the results
        System.out.println("Temperatures successfully recorded!"); // Confirmation message
        System.out.println("Average temperature is: " + average); // Print out average
        

    }
}
