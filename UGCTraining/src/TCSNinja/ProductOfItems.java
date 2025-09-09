package TCSNinja;

import java.util.Scanner;
public class ProductOfItems {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int sum=1;
		while(n>0){
			int r = n%10;
			sum = sum*r;
			n=n/10;
		}
			
		System.out.print(sum);
		
	}

}
