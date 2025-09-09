package Stack;

import java.util.Stack;

public class InfixToPrefix {

    // Reverse the string and handle parentheses
    public static String reverse(String str) {
        int n = str.length();
        StringBuilder s = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == '(') {
                s.append(')');
            } else if (ch == ')') {
                s.append('(');
            } else {
                s.append(ch);
            }
        }
        return s.toString();
    }

    // Define operator precedence
    public static int priority(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    // Function to convert infix to prefix
    public static String infixToPrefix(String str) {

    	String S = reverse(str);

        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (char ch : S.toCharArray()) {

        	if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }
            else if (ch == '(') {
                st.push(ch);
            }
            // If the character is a closing parenthesis ')'
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
            }
            else if(ch == '^') {
            	while(!st.isEmpty() && priority(ch) <= priority(st.peek())) {
            		ans.append(st.pop());
            	}
            }
            // If the character is an operator
            else {
                while (!st.isEmpty() && priority(ch) < priority(st.peek())) {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }

        // Step 3: Pop remaining operators from the stack
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        // Step 4: Reverse the result to get the prefix expression
        return reverse(ans.toString());
    }

    public static void main(String[] args) {

    	String str = "(A+B)*C-D+F";

        String ans = infixToPrefix(str);
        System.out.println("Prefix Expression: " + ans);
    }
}
