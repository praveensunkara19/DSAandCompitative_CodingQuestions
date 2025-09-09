package arrays;
import java.util.*;
public class Qsn2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer:");
		int n = sc.nextInt();
		boolean b =false;
		int[] array = {3,4,5,2,5}; 
		for(int element:array) {
			if(n==element) {
				b = true;
				break;
			}
		
		}
		if(b) {
		System.out.println("the given element is present in the array");
		}
		else {
			System.out.println("the given integer is not present in the array");
		}
	}

}
