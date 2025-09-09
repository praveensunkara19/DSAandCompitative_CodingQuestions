package algorithms;

import java.util.*;
public class BinaryPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s1 = "";
		String s2 = "";
		while(n>0) {
			s1 = n%2 + s1;
			s2 = s2 + n%2;
			n=n/2;
		}
		if(s1.equals(s2)) {
			System.out.println("binary palindrome");
		}
		else {
			System.out.println("not a binary palindrome");
		}
	}
}
