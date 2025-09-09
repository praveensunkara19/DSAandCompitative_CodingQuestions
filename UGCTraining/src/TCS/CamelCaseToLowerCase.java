package TCS;
import java.lang.*;
import java.util.*;
public class CamelCaseToLowerCase {

	public static void main(String[] args) {
		
		String str = "HeyYou";
		String st = "";
		char[] arr = str.toCharArray();
		
		for(int i =0;i<str.length();i++) {
			if(Character.isUpperCase(arr[i])) {
				st =  (st + Character.toLowerCase(arr[i]));
				
			}
			else {
				st+=arr[i];
			}
		}
		System.out.print(st);
		
	}

}
