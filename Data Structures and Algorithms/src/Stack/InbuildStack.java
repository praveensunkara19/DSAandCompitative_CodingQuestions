package Stack;

import java.util.Stack;

public class InbuildStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		s.add(3);
		s.add(5);
		s.add(8);
		System.out.println(s);
		
		System.out.println(s.pop());
		
		System.out.println( s.peek());
		for(int i:s) {
			System.out.println(s);
		}
		System.out.println(s.isEmpty());
	}

}
