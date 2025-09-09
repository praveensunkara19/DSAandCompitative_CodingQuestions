package TCS_CodeVita;

import java.util.*;
public class SubStrings {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String s1 = sc.nextLine();
	String s2 = sc.nextLine();
	
	int S = sc.nextInt();
	int R = sc.nextInt();
	
		int result = stringFactor(s1,s2,S,R);
		System.out.println(result);
	}

	private static int stringFactor(String s1, String s2, int s, int r) {
		int count1=0;
		int count2=0;
		s1.toCharArray();
		
		String s3 = "";
		for (int i = 0; i <s2.length(); i++) {
			s3 = s2.charAt(i)+s3;
		}
		
		for(int i=0;i<s1.length();i++) {
//			for(int j=0;j<s2.length()-i;j++)
			if((s1.substring(i)).contains(s2)) {
				count1++;
			}
			else if(s1.substring(i).contains(s3)) {
				count2++;
			}
		}
//		System.out.println(s3);
//		for(int i=0;i<s1.length();i++) {
//			for(int j=0;j<s1.length()-i;j++)
//			if((s1.substring(i+j)).contains(s3)) {
//				count2++;
//			}
//		}
		
		System.out.println(count1 + " " +count2);
		return (count1*s+count2*r);
	}

}
