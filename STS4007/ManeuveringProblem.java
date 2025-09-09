package STS4007;
import java.util.*;
import java.util.Scanner;

public class ManeuveringProblem {
	
	public static  int numberOfPaths(int m, int n) {
		if(m==1||n==1) {
			return 1;
		}
		else {
			return numberOfPaths(m-1,n)+numberOfPaths(n,m-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter the value of m:");
		int m = sc.nextInt();
		System.out.print("Eneter the value of n:");

		int n = sc.nextInt();
		System.out.println(numberOfPaths(m,n));
		
	}

}
