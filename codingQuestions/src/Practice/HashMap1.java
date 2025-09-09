package Practice;

import java.util.*;
public class HashMap1 {
	
	static int[] matchingString(String[] strings, String[] queries) {
		int[] countArray = new int[queries.length]; 
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		for(int i=0;i<strings.length;i++) {
			String str = strings[i];
			if(hashMap.containsKey(str)) {
				hashMap.put(str, hashMap.get(str)+1);
			}
			else {
				hashMap.put(str, 1);
			}
		}
		System.out.println(hashMap);
		for(int i=0;i<queries.length;i++) {
			if(hashMap.containsKey(queries[i])) {
				countArray[i] = hashMap.get(queries[i]);
			}
		}
		
		System.out.println(hashMap);
		return countArray;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter Strings length");
		int n1 = sc.nextInt();
		System.out.println("enter Strings");
		String[] strings = new String[n1];
		for(int i=0;i<n1;i++) {
			strings[i] = sc.next();
		}
		
		System.out.println("enter the Queries length");
		int n2 = sc.nextInt();
		System.out.println("enter the Queries");
		String[] queries = new String[n2];
		for(int i=0;i<n2;i++) {
			queries[i] = sc.next();
		}
		
		int[] result = matchingString(strings, queries);
		System.out.println(Arrays.toString(result));
		
	}

}
