package Strings;

import java.util.Scanner;

public class Srtings {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
		String s = "hello world";
		
		String s2 = " ";
		char ch;
		for(int i=0; i<s.length(); i++) {
			 ch = s.charAt(i);
			 s2 = ch + s2;
		}
		System.out.println(s2);
		System.out.println((Object)s2.getClass().getSimpleName());
		
	}
}
