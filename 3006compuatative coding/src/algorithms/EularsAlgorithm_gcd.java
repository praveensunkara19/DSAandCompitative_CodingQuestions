package algorithms;

import java.util.Scanner;
public class EularsAlgorithm_gcd {
	
	static  int gcd(int a, int b) {
		 if(a==0) 
		 return b;
		 return gcd(b%a,a);
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1 number:");
		int n1 = sc.nextInt();
		System.out.println("enter the 2 number:");
		int n2 = sc.nextInt();
		System.out.println(gcd(n1,n2));
		
		
	}

}
