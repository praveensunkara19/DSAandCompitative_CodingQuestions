package TCSNinja;

import java.util.Scanner;
public class factorization {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		
		int d =2;
		int c =0;
		
		while(n>1) {
			if(n%d==0) {
				c+=1;
				n=n/d;
			}
			else {
				if(c>0) {
					System.out.println(d +"-->"+ c);
				}
				d++;
				c=0;
			}
		}
		System.out.println(d +"-->"+ c);
	}

}
