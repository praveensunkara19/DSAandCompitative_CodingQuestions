package leetCode;

import java.lang.Math;
public class SellStocksArrays {
	
	public static int bestTimeToBuySell(int[] arr) {
		
		int maxPro = 0;
		int minPri = arr[0];//Integer.MAX_VALUE;
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]<minPri) {
				minPri = arr[i];
			}
			else {
				int profit = arr[i] - minPri;
				maxPro = Math.max(maxPro, profit);
			}
		}
		
		
		return maxPro;
	}
	
	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4 };
		
		int result = bestTimeToBuySell(arr);
		System.out.println(result);
	}

}
