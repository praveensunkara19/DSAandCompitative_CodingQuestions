package STS4007;

public class LeadersAlog1 {
	
	

	public static void main(String[] args) {
		
//		int[ ] arr = new int[]{1,5,3,2};
//		
//		int n=arr.length;
//		
//		for(int i=0;i<n;i++) {
//			int j;
//			for( j=i+1;i<n;j++) {
//				if(arr[i]<=arr[j])
//					break;
//			}
//			if(j == n);
//			System.out.println(arr[i]+" ");
//		}
		
		int[] arr1 = new int[] {9,4,13,6,2};
		int size = arr1.length;
		
		int max_from_right = 0;
		for(int i=size-1;i>=0;i--) {
			if(max_from_right < arr1[i]) {
				max_from_right = arr1[i];
				System.out.print(max_from_right+" ");
			}
		}
	
	}

}
