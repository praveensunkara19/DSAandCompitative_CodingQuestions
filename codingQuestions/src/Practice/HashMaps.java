package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMaps {

	public static void main(String[] args) {

		HashMap<String,Integer> hashMap = new HashMap<>();
		
		hashMap.put("apple",1);
		hashMap.put("banana",2);
		hashMap.put("cat",3);
		
		System.out.println(hashMap);
		
		boolean a = hashMap.containsKey("apple");
		boolean b = hashMap.containsValue(5);
		System.out.println(a);
		System.out.println(b);
		
		int str = hashMap.get("banana");
		System.out.println(str);
		
		Integer keyValue = hashMap.get("apple");
		System.out.println(keyValue);
		
		Set<String> keys = hashMap.keySet();
		for(String st : keys) {
			System.out.print(st+" ");
		}
		
//		Set<Integer> values = (Set<Integer>) hashMap.values();
//		for(int i:values) {
//			System.out.println(i);
//		}
		System.out.println();
		Set<Entry<String, Integer>> vals = hashMap.entrySet();
		for(Map.Entry<String, Integer> e : vals) {
			System.out.println(e.getKey()+":"+e.getValue());
			e.setValue(keyValue);
		}
		
	}

}
