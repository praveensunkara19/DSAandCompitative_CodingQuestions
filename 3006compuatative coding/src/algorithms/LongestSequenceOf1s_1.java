package algorithms;

import java.util.Scanner;

public class LongestSequenceOf1s_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input integer
        int n = sc.nextInt();
        sc.close();

        // Convert the integer to its binary representation as a string
        String s = Integer.toBinaryString(n);
        System.out.println("Binary representation: " + s);

        int max = 0;  // To store the longest sequence of 1's
        int count = 0;  // To count the current sequence of 1's

        // Iterate over the binary string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '1') {
                // If the character is '1', increment the count
                count++;
            } else {
                // If the character is '0', reset the count and update max if needed
                max = Math.max(max, count);
                count = 0;  // Reset the count when encountering a '0'
            }
        }

        // After the loop, ensure to update max if the longest sequence was at the end

        // Output the longest sequence of consecutive 1's
        System.out.println("Longest sequence of 1's: " + max);
    }
}
