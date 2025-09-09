package Accenture;

import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		int r =0;
		while(n>0) {
			r = n%10;
			sum = sum+r*10;
			n = n/10;
		}
		if(n == sum)
		System.out.println(sum);
	}

}
