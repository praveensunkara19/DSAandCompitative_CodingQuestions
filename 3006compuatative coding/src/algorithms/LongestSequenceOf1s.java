package algorithms;
import java.util.Scanner;

public class LongestSequenceOf1s {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int count = 0;
		int previous = 0;
		int n = sc.nextInt();
		
		String s = Integer.toBinaryString(n);
		System.out.println(s);
		
		for(int i = 0;i<s.length();i++) {
			char ch = s.charAt(i); 
			if(ch == '1') {
				count ++;
				if(count == s.length()) {
					max = count;
					System.out.println(max);
					System.exit(0);
				}
				else {
					max = Math.max(max, count+previous+1);
					previous =count;
					count = 0;
				}
			}
			
		}
		max = Math.max(max, count+previous+1);
		System.out.println(max);
	}
}
