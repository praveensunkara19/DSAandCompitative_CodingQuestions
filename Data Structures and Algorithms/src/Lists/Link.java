package Lists;

import java.util.LinkedList;

public class Link {
	
	

	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		
		link.add("obj");
		link.add("app");
		link.add("mang");
		
		System.out.println(link);
		
		link.addFirst("banana");
		
		System.out.println(link);
		
		link.addLast("cherry");
		System.out.println(link);
		
		boolean a = link.contains("app");
		System.out.println(a);
		
		link.add(4, 9);
		System.out.println(link);
		
		
		
	}

}
