package sorting;

//Selection sort identifies the minimum element and swap it with the index(i) element.

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = {2,9,7,1,8,4,5};
		int size = arr.length;
		
		System.out.println("before iteration");
		for(int nums : arr) {
			System.out.print(nums+" ");
		}
		System.out.println();
		
		int temp;
		int minValueIndex;
//		int maxValueIndex;
		
		for(int i=0;i<size-1;i++) {
			
			minValueIndex = i;
//			maxValueIndex = i;
			
//			finds the minimum value
			for(int j=i+1;j<size;j++) {
				if(arr[minValueIndex] > arr[j])
					minValueIndex = j;
			}
			
			temp = arr[minValueIndex];
			arr[minValueIndex] = arr[i];
			arr[i] = temp;
			
		}
			for(int nums : arr) {
				System.out.print(nums+" ");
			}
			System.out.println();
		
	}
	

}
