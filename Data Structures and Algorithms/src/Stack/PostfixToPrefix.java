package Stack;

import java.util.Stack;

public class PostfixToPrefix {
	
	public static String postfToPref(String str) {
		
		char[] ch = str.toCharArray();
		Stack<String> st = new Stack<>();
		
		for(char c : ch) {
			if(Character.isLetterOrDigit(c)) {
				st.push(Character.toString(c));
			}
			else {
				
				String s1 = st.pop();
				String s2 = st.pop();
				
				String s = c+s2+s1;
				st.push(s);
				
			}
		}
		return st.peek();
	}
	
	public static void main(String[] args) {
		
		String str = "AB-DC+F*/";		
		String ans = postfToPref(str);
		System.out.println(ans);;
	}

}
