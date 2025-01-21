package src;

import java.util.Scanner;

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
            temperatures[i] = scanner.nextDouble();  // store each input
        }

        // Just a confirmation
        System.out.println("Temperatures successfully recorded!");

    }
}
