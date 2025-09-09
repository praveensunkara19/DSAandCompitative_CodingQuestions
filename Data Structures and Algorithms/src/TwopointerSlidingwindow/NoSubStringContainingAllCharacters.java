package TwopointerSlidingwindow;

import java.util.Arrays;

public class NoSubStringContainingAllCharacters {
	public static int noSubStrings(String str) {
		int n = str.length();
		int cnt = 0;
		int[] lastseen = {-1,-1,-1};
		for(int i=0;i<n;i++) {
			lastseen[str.charAt(i)-'a'] = i;
			if(lastseen[0]!=-1&&lastseen[1]!=-1&&lastseen[2]!=-1) {
				cnt = cnt+(1+Math.min(lastseen[0],Math.min(lastseen[1], lastseen[2])));
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		String str = "abcabc";//"bbacba";
		int ans = noSubStrings(str);
		System.out.println(ans);
	}


}
