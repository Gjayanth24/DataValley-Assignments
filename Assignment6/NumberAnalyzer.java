/* Write a Java program to enter numbers until the user wants, and at the end, the program should display the largest and smallest numbers entered. Additionally, the program should calculate and display the average of all the numbers entered.
 */

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        boolean continueInput = true;
        while (continueInput) {
            System.out.print("Enter a number (enter 0 to stop): ");
            int number = scanner.nextInt();

            if (number == 0) {
                continueInput = false;
            } else {
                // Update largest and smallest numbers
                if (number > largest) {
                    largest = number;
                }
                if (number < smallest) {
                    smallest = number;
                }
                // Add the number to sum and increment count
                sum += number;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;

            // Display results
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Average of all numbers: " + average);
        } else {
            System.out.println("No numbers entered.");
        }

        scanner.close();
    }
}
