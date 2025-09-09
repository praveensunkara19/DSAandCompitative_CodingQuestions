package Stack;

import java.util.Stack;
public class PrefixToPostfix {
	
	public static String prefToPostf(String str) {
		char[] ch = str.toCharArray();
		Stack<String> st = new Stack<>();
		int n = str.length();
		for(int i=n-1;i>=0;i--) {
			if(Character.isLetterOrDigit(ch[i])) {
				st.push(Character.toString(ch[i]));
			}
			else {
				String s1 = st.pop();
				String s2 = st.pop();
				String s = s1+s2+ch[i];
				st.push(s);
			}
		}
		return st.peek();
	}
	
	public static void main(String[] args) {
		String str = "/-AB*+DEF";
		String ans = prefToPostf(str);
		System.out.println(ans);
	}

}
