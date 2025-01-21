package src;

import java.util.Scanner;

// Main class to execute project's code
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Displaying the program's start message to the user
        System.out.print("How many temperatures do you want to enter? ");
        int n = scanner.nextInt();  // read integer input

        System.out.println("You will enter " + n + " temperature values.");
    }
}
