package algorithms;

import java.util.Scanner;
public class SwappingTwoNibbles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		String s = Integer.toBinaryString(n);
		System.out.println(s);
		System.out.println((n&0X0F)<<4 | (n&0XF0)>>4);
	}

}
