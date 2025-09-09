package TwopointerSlidingwindow;

import java.util.*;

public class MaxConsitutiveOnes {
	public static int maxOnes(int k,int[] arr) {
		int n = arr.length;
		int maxlen = 0;
		int s=0;
		int l=0,r=0;
		int z=0;
//		HashMap<Integer,Integer> map = new HashMap<>();
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<n;i++) {
			
			if(arr[i] == 0) {
				z++;
				q.add(i);
			}
			if(z<=k) {
				if(i-s+1 > maxlen) {
					maxlen = i-s+1;
					l = s;
					r = i;
				}
			}
			if(z>k) {
				int node = q.poll();
				s = node+1;
				z--;
			}
		}
		return maxlen;
	}
	public static void main(String[] args) {
		int[] arr = {1,1,1,0,1,0,1,1,1,1,0};
		int k = 2;
		int ans = maxOnes(k,arr);
		System.out.println(ans);
	}

}
