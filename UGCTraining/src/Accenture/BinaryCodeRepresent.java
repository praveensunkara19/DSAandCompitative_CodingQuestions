package Accenture;

import java.util.*;
public class BinaryCodeRepresent {
	
	public static int fun(int n) {
		int ans =0;
		int base =1;
		while (n>0) {
			int dig = n%10;
			if( dig != 0) {
				ans = ans+1*base; //left hand side
			}
			n = n/10;
			base = base*10;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int ans;
		while(n>0) {
			
		 ans = fun(n);
		 System.out.print(ans+" ");
		 n = n-ans;
		}
		
	}

}
