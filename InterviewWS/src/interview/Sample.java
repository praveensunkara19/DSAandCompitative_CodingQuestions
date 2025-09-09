package interview;
/**printing the unique elements*/
public class Sample {

	public static void main(String[] args) {
		

		String value = "india";						
		char valueArray[] = value.toCharArray();
		for(int i=0; i< valueArray.length; i++) {
			
			int count =0;
			for(int j=0; j<valueArray.length; j++) {
				if(valueArray[i] == valueArray[j]) {
					count++;
				}
				
			}
			if(count==1) {
				System.out.print(valueArray[i]);
			}
		}
		
	}

}
