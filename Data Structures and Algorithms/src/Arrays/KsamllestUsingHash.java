package Arrays;


/*
 * using Hash maps we can get the kth smallest/ largest with time complesity of O(nlog(n))
 */

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Collections;

import java.util.Comparator;
public class KsamllestUsingHash {
	
	public static int kthEle(PriorityQueue<Integer> heap, int k) {
		int min = 0;
		
		while(k>0) {
			
			min = heap.poll();
			
			k--;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder()); // default it is minHeap
														//Comparator.reverseSort();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0;i<n;i++) {
//			if(!heap.contains(sc.nextInt()))
			heap.add(sc.nextInt());
		}
		 int k = sc.nextInt();
		 
		int min = kthEle(heap, k);
		
		System.out.println(min);
	}

}
