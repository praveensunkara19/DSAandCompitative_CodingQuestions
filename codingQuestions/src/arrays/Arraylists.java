package arrays;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
public class Arraylists {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		for(int element:arr) {
			System.out.println(element);
		}
		System.out.println(arr);
		String s = Arrays.toString(arr);
		System.out.println(s);
		
		int[ ] ar = new int[7];
		ar[0] =0;
		ar[1] = 1;
		ar[2] = 2;
		ar[3] = 3;
		
		ar[6] = 7;

		String s1 = Arrays.toString(ar);
		System.out.println(s1);
		
		List<Integer> obj = new ArrayList<>();
		obj.add(1);
		obj.add(4);
		System.out.println(obj);
	}

}
