package TCS;

import java.util.Scanner;

public class ShiftingStrings {

	public static void main(String[] args) {
		int n = 2;
		
		
		Scanner sc = new Scanner(System.in);
		
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		

		char[] arr = input1.toCharArray();
		
		if(input2 == "R") {
			
			for(int i=n;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
		}
		if(input2 == "L") {
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]);
			}
		}
		
		
	}

}
