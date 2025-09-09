package TCS;

import java.util.*;
import java.lang.Math;
public class NextPerfectSqare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sq = Math.sqrt(n);

        // Check if the square root is an integer
        if (sq == (int) sq) {
            // Calculate the next perfect square
            int nextPerfectSquare = (int) Math.pow(sq + 1, 2);
            System.out.println(n +"-->"+nextPerfectSquare);
        } else {
            System.out.println(n+"-->"+"-1");
        }
        
//        sq = (int) sq ? (int) Math.pow(sq+1, 2) : -1;
        

		
	}

}
