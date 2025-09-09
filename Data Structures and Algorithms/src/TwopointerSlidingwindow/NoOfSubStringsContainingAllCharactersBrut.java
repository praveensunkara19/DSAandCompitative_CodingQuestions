package TwopointerSlidingwindow;

import java.util.*;
public class NoOfSubStringsContainingAllCharactersBrut {
	
	public static int noSubStrings(String str) {
		int r=0;
		int maxsub = 0;
		int n = str.length();
		//finding all the unique char;
		HashSet<Character> set1 = new HashSet<>();  //SC: O(N)
		for(int i=0;i<n;i++) { 						//TC: O(N)
			set1.add(str.charAt(i));
		}
		int s1 = set1.size();
		set1.clear();
		for(int i=0;i<n;i++) {  			//O(N)
			char c = str.charAt(i);
			set1.add(c);
			if(set1.size() == s1) {
				r=i;
				HashSet<Character> set2 = new HashSet<>();
				while(r>=0) { 			//O(N)--worst case
					set2.add(str.charAt(r));
					if(set2.size() == s1) {
						maxsub++;
					}
					r--;
				}
			}
		}
		return maxsub;
	}
	
	public static void main(String[] args) {
		String str = "bbacba";
		int ans = noSubStrings(str);
		System.out.println(ans);
	}

}
