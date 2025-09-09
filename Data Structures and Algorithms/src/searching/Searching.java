package searching;

public class Searching {

	public static void main(String[] args) {
		int[] arr = {3,5,9,11,13,15};
		int tar = 9;
		
//		int result = linearSearch(arr,tar);
//		System.out.print(result);
		int result2 = biLinearSearch(arr,tar);
		System.out.println(result2);
	}

	public static int linearSearch(int[] arr, int tar) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(tar == arr[i])
				return i;
		}
		return -1;
		
	}
	public static int biLinearSearch(int[] arr,int tar) {
		int f = 0;
		int r = arr.length-1;
		
//		3,5,9,11,13,15  -- 11 
		
		while(f<=r) {
			int mid = (f+r)/2;
			
			if(arr[mid] == tar) {
				return mid;
			}
			else if(arr[mid]<tar) {
				f = mid+1;
			}
			else  {
				r = mid-1;
			}
	}
		return -1;

}
}