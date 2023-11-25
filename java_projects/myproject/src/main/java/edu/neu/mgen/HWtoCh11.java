package edu.neu.mgen;

import java.util.Scanner;

public class HWtoCh11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Reading from the terminal
            System.out.print("Enter a integer number: ");
            int inputText = scanner.nextInt();
            System.out.println("You entered: " + inputText);
        } catch (Exception e) {
            // Handle any input-related exceptions
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
