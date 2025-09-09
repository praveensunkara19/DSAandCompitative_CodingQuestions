package TCS;

import java.util.ArrayList;
import java.util.*;

public class SumWithOutHighestLowest {
	
	public static int sum(int[] numbers) {

		if(numbers==null || numbers.length==0||numbers.length ==1)return 0;

		int min, max, sum;

		sum = min = max = numbers[0];

		for(int i=1;i<numbers.length;i++){

		sum+=numbers[i];

		if(numbers[i] < min) min = numbers[i]; 
		if (numbers[i] > max) max = numbers[i];
		
//		System.out.println(min+ " " + max);
		
		}
		return sum-min-max ;
	}
	public static void main(String[] args) {
		int[] numbers = {2,6,98,3,9};
		System.out.println(sum(numbers));
		
	}

}
