package searching;

public class BilinearSearch {
	
	public static int biLinearSearch(int[] arr, int target, int l,int r) {
		while(l<=r) {
			int mid = (l+r)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target)
				return biLinearSearch(arr,target,mid+1,r);
			else
				return biLinearSearch(arr,target,l,mid-1);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {2,5,8,10,12};
		int target = 5;
		int result = biLinearSearch(arr,target, 0,arr.length);
			System.out.println(result);
				}

}
