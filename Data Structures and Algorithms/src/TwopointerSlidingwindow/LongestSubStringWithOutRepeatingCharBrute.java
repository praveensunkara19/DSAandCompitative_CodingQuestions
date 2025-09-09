package TwopointerSlidingwindow;

import java.util.HashMap;
import java.util.HashSet;
//bruteforce approch! not satisfied by all test cases.but few!
//TC O(N); SC:O(N)

public class LongestSubStringWithOutRepeatingCharBrute{
	public static String lengthOfLongestString(String str) {
		int n = str.length();
		HashSet<Character> set = new HashSet<>(); 
		char[] ch = str.toCharArray();
		String s = "";
		String word = "";
		for(int i=0;i<n;i++) {   //O(N)
			char c = ch[i];
			if(!set.contains(c)){
				set.add(c);
				s = s+c;
			}
			else {
				if(word.length() < s.length()) {
				word = s;
				}
				set.clear();
				s = "";
				
			}
			
			if (word.length() < s.length()) {
	            word = s;
	        }
		}
		return word;
	}

	public static void main(String[] args) {
		
		String str = "abcab";
		
		String ans  = lengthOfLongestString(str);
		System.out.println(ans);
		
	}

}
