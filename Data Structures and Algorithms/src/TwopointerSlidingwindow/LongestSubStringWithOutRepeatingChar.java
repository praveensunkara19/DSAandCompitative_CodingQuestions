package TwopointerSlidingwindow;

import java.util.*;

class Get {
	int l;
	int r;

	Get(int l, int r) {
		this.l = l;
		this.r = r;
	}

	public int getL() {
		return l;
	}

	public int getR() {
		return r;
	}
}

public class LongestSubStringWithOutRepeatingChar {

	public static Get maxLen(String str) {
		int n = str.length();
		Map<Character, Integer> map = new HashMap<>();
		int start = 0,
		maxLen = 0;
		int l = 0, r = 0;

		for (int i = 0; i < n; i++) {
			char c = str.charAt(i);
			if (map.containsKey(c) && map.get(c) >= l) {
				start = map.get(c) + 1;
			}
			map.put(c, i);
			if (i - start + 1 > maxLen) {
				maxLen = i - start + 1;
				l = start;
				r = i + 1;
			}
		}

		return new Get(l, r); // bestR is exclusive
	}

	public static void main(String[] args) {
		String str = "aab";
		Get ans = maxLen(str);

		System.out.println("Start Index: " + ans.getL()); // inclusive
		System.out.println("End Index: " + ans.getR()); // exclusive
		System.out.println("Length: " + (ans.getR() - ans.getL()));

		System.out.print("Substring: ");
		for (int i = ans.getL(); i < ans.getR(); i++) {
			System.out.print(str.charAt(i));
		}
	}
}
