package TCSNinja;

import java.util.*;
import java.lang.*;
public class StringsSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
//		s1.toCharArray();
//		s2.toCharArray();
		
	
		
		for(int i=0;i<s1.length();i++) {
			for(int j=i;j<s2.length();j++) {
				
				if(s1.charAt(i) == s2.charAt(j)) ;
				else {
					System.out.print(s1.charAt(i));
				}
			}
		}
	}

}
