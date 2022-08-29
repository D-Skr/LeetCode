package stack;

import java.util.Stack;

public class MatchParentheses {
	//return true if parentheses format is valid
	//return false if parentheses format is invalid
	
	public static boolean hasMatchingParentheses(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (current =='(') {
				stack.push(current);
			} else if (current == ')') {
				if(!stack.isEmpty()) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		System.out.println(hasMatchingParentheses("((string()))")); //true
		System.out.println(hasMatchingParentheses("((string)))")); //false
		System.out.println(hasMatchingParentheses("string()))")); //false
		System.out.println(hasMatchingParentheses("()string()")); //true
		System.out.println(hasMatchingParentheses("((string(")); //false
	}

}
