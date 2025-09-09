package sorting;

public class BubbleSorting {

	public static void main(String[] args) {

		int[] arr = {2,9,1,8,10,5,3};
		
		int size = arr.length;
		
		int temp ;
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("After Sorting");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]);
		}
	}

}
