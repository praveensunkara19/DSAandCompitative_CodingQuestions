package arrays;

import java.util.Scanner;
public class UtopianTree1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the cycles:");
		int n = sc.nextInt();  //5
		int treeLength = cycles(n);
		System.out.println(treeLength);
		sc.close();
	}
	public static int cycles(int n) {
		int initialLen =1 ;
//		int len;
		for(int i=1; i<=n; i++) {
			
			if(i%2==0) {
				initialLen = initialLen + 1;
			}
			else {
				initialLen = initialLen * 2 ;
			}
			
//			System.out.println(initialLen);
		}
		return initialLen;
			
	}
}
