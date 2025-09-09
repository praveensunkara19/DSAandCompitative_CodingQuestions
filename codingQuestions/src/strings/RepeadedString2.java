package strings;

import java.util.*;

public class RepeadedString2 {
	
	static long repeatedString(String str, long n) {
		long strLen = str.length();
		long subStringLen = n/strLen;
		long rem = n%strLen;
		
		long count = 0;
		for(int i =0;i<strLen;i++) {
			if(str.charAt(i) == 'a') {
				count++;
			}
		}
//		System.out.println(count);
		count = count*subStringLen;
		
//		System.out.println(count);
		
		for(int i=0;i<rem;i++) {
			if(str.charAt(i)=='a') {
				count++;
			}
		}
		
		//return the total no of a in repeatedstring 
		return count;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		long  n = sc.nextInt();
		
		long result = repeatedString(str,n);
		System.out.println(result);
		
	}

}
