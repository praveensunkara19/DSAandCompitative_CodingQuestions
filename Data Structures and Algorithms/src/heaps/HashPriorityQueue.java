package heaps;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
//import java.util.Scanner;

public class HashPriorityQueue {
	
	public static PriorityQueue<Integer> minHeap(int[] arr)  {
		
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		int n = arr.length;
		for(int i=0;i<n;i++) {
			heap.add(arr[i]);
		}
		
		System.out.println(heap.peek());
		System.out.println(heap.poll());
		System.out.println(heap.peek());

		
		return heap;
		
		
	}
	public static PriorityQueue<Integer> maxHeap(int[] arr) {
		PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
		
		int n = arr.length;
		for(int i=0;i<n;i++) {
			heap.add(arr[i]);
		}
		
		System.out.println(heap.peek());

		System.out.println(heap.poll());
		
		System.out.println(heap.peek());
		
		return heap;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {8,9,1,0,3,7};
		
		System.out.println(minHeap(arr));
		System.out.println(maxHeap(arr));
		
		
	}

}
