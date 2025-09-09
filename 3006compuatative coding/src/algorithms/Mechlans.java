package algorithms;

public class Mechlans {

    public static void main(String[] args) {
        String str = "abababababad";
        int n = str.length();

        // Step 1: Transform the original string to add # between characters and at the boundaries
        char[] arr = new char[2 * n + 1];
        int[] value = new int[2 * n + 1];  // This will store the palindrome radius lengths

        for (int i = 0, j = 0; j < n; i++, j++) {
            arr[i] = '#';  // Insert # between characters and at boundaries
            i++;
            arr[i] = str.charAt(j);
        }
        arr[2 * n] = '#';  // Add the final # at the end

        // Step 2: Initialize variables for the center and right boundary of the palindrome
        int C = 0;  // Center of the current palindrome
        int Rt = 0; // Right boundary of the current palindrome
        int maxLen = 0;  // Length of the longest palindrome
        int centerIdx = 0;  // Center index of the longest palindrome

        // Step 3: Process each character in the transformed string
        for (int i = 0; i < arr.length; i++) {
            // Mirror of current index `i` with respect to center `C`
            int mirr = 2 * C - i;

            // If within the current palindrome's right boundary, use the mirror's value
            if (i < Rt) {
                value[i] = Math.min(value[mirr], Rt - i);
            }

            // Try expanding the palindrome centered at i
            int l = i - (value[i] + 1);  // Left boundary
            int r = i + (value[i] + 1);  // Right boundary
            while (l >= 0 && r < arr.length && arr[l] == arr[r]) {
                value[i]++;
                l--;
                r++;
            }

            // Update the center and right boundary if the palindrome expanded past Rt
            if (i + value[i] > Rt) {
                C = i;
                Rt = i + value[i];
            }

            // Track the longest palindrome found
            if (value[i] > maxLen) {
                maxLen = value[i];
                centerIdx = i;
            }
        }

        // Step 4: Extract the longest palindromic substring from the original string
        int start = (centerIdx - maxLen) / 2;  // Get the start index in the original string
        String longestPalindrome = str.substring(start, start + maxLen);
        
        System.out.println("Longest Palindromic Substring: " + longestPalindrome);
    }
}
