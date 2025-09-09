package Stack;

import java.util.Stack;

public class InfixToPostfix {

    // Function to define operator precedence
    private static int precedence(char ch) {
//        switch (ch) {
//            case '+':
//            case '-':
//                return 1; // Lowest precedence
//            case '*':
//            case '/':
//                return 2; // Higher precedence
//            case '^':
//                return 3; // Highest precedence
//            default:
//                return -1; // For non-operators
        if(ch =='+' || ch =='-') {
        	return 1;
        }
        else if(ch=='*' || ch=='/') {
        	return 2;
        }
        else if(ch=='^') {
        	return 3;
        }
        else {
        	return -1;
        }
    }

    // Function to convert infix to postfix
    public static String infToPostf(String s) {
        char[] S = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (char ch : S) {
            // If the character is an operand (a-z, A-Z, or 0-9)
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }
            // If the character is an opening parenthesis '('
            else if (ch == '(') {
                st.push(ch);
            }
            // If the character is a closing parenthesis ')'
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop(); // Pop the '('
                }
            }
            // If the character is an operator
            else {
                while (!st.isEmpty() &&  precedence(ch) <= precedence(st.peek()) ) {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }

        // Pop all remaining operators from the stack
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "a+b*(c^d-e)";
        String ans = infToPostf(str);
        System.out.println("Postfix Expression: " + ans);
    }
}
