package Stack;

import java.util.Stack;
public class PrefixToInfix {
	
	public static String prefToInf(String str) {
		
		int n = str.length();
		Stack<String> st = new Stack<>();
		char[] ch = str.toCharArray();
 		
		for(int i=n-1;i>=0;i--) {
			if(Character.isLetterOrDigit(ch[i])) {
				st.push(Character.toString(ch[i]));
			}
			else {
				String s1 = st.pop();
				String s2 = st.pop();
				String s = "(" + s1 + ch[i] + s2 + ")";
				
				st.push(s);
				
			}
		}
		return st.peek();
		
		
	}
	
	public static void main(String[] args) {
		
		String str = "*+PQ-MN";
		
		String ans = prefToInf(str);
		
		System.out.println(ans);
		
	}

}
