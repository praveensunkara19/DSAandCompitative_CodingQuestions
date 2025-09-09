package TCSNinja;

import java.util.*;

public class NumbersInStrings {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        sc.close();  // It's a good practice to close the Scanner once input is done
        
        int sum = 0;

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the character is a digit
            if (Character.isDigit(s.charAt(i))) {
                // Convert the character to a digit and add to sum
                sum += Character.getNumericValue(s.charAt(i));
            }
        }

        // Print the sum of the digits found in the string
        System.out.println("Sum of digits in the string: " + sum);
    }
}
