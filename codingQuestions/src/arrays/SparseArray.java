package arrays;


import java.util.Scanner; 
import  java.util.Arrays;

import java.util.Map;
import java.util.HashMap;
public class SparseArray {
	
//	strings = {"ab","ab","abc"};
//	queries = {"ab", "abc","bc"};
	
	static int[] matchingStrings(String[] string, String[] queries) {
		Map<String, Integer> map = new HashMap<>();
		
		int result[] = new int[queries.length];
		
		for(int i=0;i<string.length; i++) {
			
			String inputString = string[i];
			
			if(map.containsKey(inputString)) {
				map.put(inputString, map.get(inputString) + 1);
			}
			else {
				map.put(inputString, 1);
			}
		}
//		map = {ab : 1, ab : 2, abc :1}
		
		System.out.println(map);
		for(int i = 0; i<queries.length; i++) {
			String queryString = queries[i];
			if(map.containsKey(queryString)) {
				result[i] = map.get(queryString);
			}
		}
		System.out.println(map);
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no.of strings:");
		int noOfStrings = sc.nextInt();
	
		System.out.println("enter the strings:");
		String str[] = new String[noOfStrings];

		for (int i = 0; i < noOfStrings; i++) {
			str[i] = sc.next();
		}
		
		System.out.println("Enter the no.of queries:");
		int queries = sc.nextInt();
		String strQ[] = new String[queries];
		
		System.out.println("enter the queries:");
		for (int i = 0; i < queries; i++) {
			strQ[i] = sc.next();
		}
		int[] counter = matchingStrings(str, strQ);
		System.out.println(Arrays.toString(counter));
		sc.close();
		
	}

}
