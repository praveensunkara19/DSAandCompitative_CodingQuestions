package TCS;

import java.util.Scanner;

public class AverageOfNElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();  
        // Step 2: Input the elements as a space-separated string
        System.out.print("Enter the elements separated by spaces: ");
        String input = sc.nextLine();

        // Step 3: Split the string into an array of substrings
        String[] elements = input.split(" "); // Split by space

        // Step 4: Convert the non-empty substrings to integers
        int[] arr = new int[n]; // To store the converted integers
        int count = 0; // To track valid numbers entered

        for (String element : elements) {
            if (!element.isEmpty()) { // Ignore empty strings
                arr[count] = Integer.parseInt(element); // Convert to integer
                count++;
            }
        }

        // Step 5: Check if the number of valid elements matches the expected count
        if (count != n) {
            System.out.println("Error: Number of valid inputs does not match expected count.");
            return;
        }

        // Step 6: Calculate the sum of the array elements
        int sum = 0;
        for (int num : arr) {
            sum += num; // Sum up all the numbers
        }

        // Step 7: Calculate and print the average
        double average = (double) sum / n;
        System.out.println("Average: " + average);

        sc.close(); // Close the scanner
    }
}
