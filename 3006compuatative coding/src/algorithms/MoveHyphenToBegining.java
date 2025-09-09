package algorithms;

import java.util.*;
public class MoveHyphenToBegining {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String s1 = "";
		String s2 = "";
		for(int i =0; i<s.length();i++) {
			if(s.charAt(i) == '-') {
				s1 = s1 + s.charAt(i);
			}else {
				s2 = s2 + s.charAt(i);
			}
		}
		System.out.println(s1+s2);
	}

}
