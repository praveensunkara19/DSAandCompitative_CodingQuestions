package algorithms;

public class StringWeights {
	public static void main(String[] args) {
		String str = "ambhw";
//		String str = "-ab-c-d-ef";
		int n = str.length(), k= 15, count =0;
		
		for(int i=0; i<n;i++) {
			
			int sum =0;
			String t = "";
			for(int j=i; j<n; j++) {
				sum = sum+ (str.charAt(j)-'a'+1);
				t = t + str.charAt(j);
							//return the weight of the string
				if(sum<=k) {
					count++;
				System.out.println(t+' ' +sum);
				}
				
			}
		}
		System.out.println(count);
	}

}
