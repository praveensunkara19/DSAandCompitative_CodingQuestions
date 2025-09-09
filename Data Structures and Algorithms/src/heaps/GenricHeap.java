package heaps;

import java.util.ArrayList;

public class GenricHeap {
	
	public static void main(String[] args) throws Exception {
		GenericHeap<Integer> heap = new GenericHeap<>();
		
		heap.insert(34);
		heap.insert(45);
		heap.insert(22);
		heap.insert(89);
		heap.insert(76);
		
		ArrayList<Integer> list = heap.heapSort();
		System.out.println(list);
		
//		Integer lis = heap.remove();
//		System.out.println(lis);
		
		
	}

}
