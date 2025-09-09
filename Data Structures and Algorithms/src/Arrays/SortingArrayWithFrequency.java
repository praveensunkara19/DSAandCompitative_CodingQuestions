package Arrays;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;

class SortingArrayWithFrequency {
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int[] arr = { 1, 1, 2, 3, 4, 4, 5, 5, 5 };
		
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		ArrayList<Map.Entry<Integer, Integer>> arrList = new ArrayList<>(map.entrySet());
		arrList.sort((a, b) -> b.getValue() - a.getValue());  //Descending order with respect to fre
		System.out.println(arrList);
		
		ArrayList<Integer> aL = new ArrayList<>();
		
		for (Map.Entry<Integer, Integer> it : arrList) {
			for (int i = 0; i < it.getValue(); i++) {
				aL.add(it.getKey());
			}
		}
		
		int[] ans = aL.stream().mapToInt(i -> i).toArray();
		for (int val : ans) {
			System.out.print(val+" ");
		}
	}
}
