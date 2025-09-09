package algorithms;

import java.util.Scanner;
import java.util.Arrays;
public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		char a[] = s1.toCharArray();
		char b[] = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println(a);
		System.out.println(b);
		
		boolean result = Arrays.equals(a,b);
		if(result = true) {
			System.out.println("the givens strings are anagrams");
			
		}
		else {
			System.out.println("not a anagrams");
		}
	}

}
