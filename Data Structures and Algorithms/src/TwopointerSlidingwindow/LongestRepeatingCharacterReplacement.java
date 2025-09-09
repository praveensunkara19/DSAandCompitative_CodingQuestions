package TwopointerSlidingwindow;

import java.util.*;
public class LongestRepeatingCharacterReplacement {
	
	public static int longestRepeatingChar(int k, String str) {
	    int maxlen = 0;
	    int l = 0;
	    int maxf = 0;
	    Map<Character, Integer> map = new HashMap<>();

	    for (int r = 0; r < str.length(); r++) {
	        char c = str.charAt(r);
	        map.put(c, map.getOrDefault(c, 0) + 1);  //track the freq of char
	        maxf = Math.max(maxf, map.get(c)); 		// len - maxf <=k valid substring with <=k changes

	        // if more than k characters need to be replaced, shrink the window
	        if ((r - l + 1) - maxf > k) {
	            char leftChar = str.charAt(l);
	            map.put(leftChar, map.get(leftChar) - 1);
	            l++;
	        }

	        maxlen = Math.max(maxlen, r - l + 1);
	    }

	    return maxlen;
	}

	public static void main(String[] args) {
		String str = "AAABBCCD";
		int ans = longestRepeatingChar(2,str);
		System.out.println(ans);
	}

}
