package Stack;
import java.util.Stack;

public class PostfixToInfix {
	
	public static String postfToInf(String str) {
		
		char[] ch = str.toCharArray();
		Stack<String> st = new Stack<>();
		
		for(char c : ch ) {
			if(Character.isLetterOrDigit(c)) {
				st.push(Character.toString(c));
			}
			else {
//				while(st.size() >= 2) {
					String s1 = st.pop();
					String s2 = st.pop();
					String s = "(" + s2+ c + s1 + ")";
					
					st.push(s);
//				}
			}
		}
		return st.peek();
	}
	
	public static void main(String[] args) {
		
		String str = "AB-DE+F*/";
		
		String ans = postfToInf(str);
		
		System.out.println(ans);
		
	}

}
