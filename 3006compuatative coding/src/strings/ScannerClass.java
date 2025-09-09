package strings;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ScannerClass {

    public static void main(String[] args) throws IOException {
        
        // Using Scanner to read a string and print its characters one by one
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        for (int i = 0; i < x.length(); i++) {
            System.out.println(x.charAt(i));
        }

        // Using BufferedReader to read an integer input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        String input = br.readLine(); // Read input as a string
        int n = Integer.parseInt(input); // Convert the string input to an integer
        System.out.println("You entered: " + n);

        // Close the scanner and buffered reader
        sc.close();
        br.close();
    }
}
