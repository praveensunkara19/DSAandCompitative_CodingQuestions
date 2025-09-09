package TCS;

import java.util.*;
public class ReversngAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char str1  = ' ';
		
		char[] str2 = str.toCharArray();
		for(int i=str2.length;i>=0;i--) {
			System.out.println(str2[i]);
			
		}
		
	}
}
