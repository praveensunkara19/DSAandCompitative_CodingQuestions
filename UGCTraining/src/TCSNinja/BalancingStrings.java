package TCSNinja;

import java.util.Scanner;

public class BalancingStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int count1 =0;
		int count2 =0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)== '*')
			count1++;
			else if(st.charAt(i)=='#')
				count2++;
		}
		if(count1==count2) {
			System.out.println(0);
		}
		else {
			System.out.println(count1-count2);
		}
	}

}
