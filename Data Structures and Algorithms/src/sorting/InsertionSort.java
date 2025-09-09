package sorting;
/*
 * Insertionsort is nothing but shifting the elements in the array
 */
public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = {3,5,1,4,9,7};
		
		for(int i=0;i<arr.length;i++) {
			
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		for(int nums:arr) {
			System.out.print(nums+ " ");
		}
	}

}
