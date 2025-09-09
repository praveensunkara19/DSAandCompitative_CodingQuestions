package algorithms;

import java.util.Scanner;

public class Strobogrammetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		String n = sc.next();
		String s = "";
		for(int i=0; i<n.length();i++) {
			char c = n.charAt(i);
			if(c == '0') s='0'+s;
			else if(c =='1') s='1' +s;
			else if(c == '6') s='9'+s;
			else if(c == '8') s ='8' +s;
			else if(c == '9') s = '6' +s;
//			else s=s+c;
			}
		System.out.println(s);
		if(s.equals(n)) {  //number is convering and comparing in strings.
//		if(s == n) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
			
		}
	}


