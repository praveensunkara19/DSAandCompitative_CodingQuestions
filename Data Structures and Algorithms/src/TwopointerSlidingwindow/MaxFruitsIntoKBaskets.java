package TwopointerSlidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class MaxFruitsIntoKBaskets {
	public static int maxFruits(int k, int[] arr) {
		int maxlen = 0;
		int n = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		int s = 0;
		int l = 0, r = 0;
		for (int i = 0; i < n; i++) {
//			if (map.containsKey(arr[i]) && map.get(arr[i]) >= s) {
//				map.put(arr[i], map.getOrDefault(arr[i],i));
//			}
			map.put(arr[i], i);
			if (map.size() <= k) {
				if (i - s + 1 > maxlen) {
					maxlen = i - s + 1;
					l = s;
					r = i;
				}
			}
			if (map.size() > k) {
				s = map.remove(arr[s]) + 1;
			}
		}
		for(int i = l;i<=r;i++) {
			System.out.print(arr[i]+" ");
		}
		return maxlen;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 3, 3, 1, 2, 1, 1, 1, 3, 3, 4 };
		int k = 2;
		int ans = maxFruits(k, arr);
		System.out.println();
		System.out.println(ans);
	}

}
