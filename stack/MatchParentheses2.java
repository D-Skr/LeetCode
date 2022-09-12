package stack;

import java.util.Stack;

public class MatchParentheses2 {
	
	public boolean isOpen(char ch){
		return ch == '{' || ch == '(' || ch == '[';
	}
	
	public boolean isPair(char open, char close) {
		return 	open == '{' && close == '}' ||
				open == '(' && close == ')' ||
				open == '[' && close == ']';
	}
	
	public boolean isBalanced(String s) {
		Stack<Character> st = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			if(isOpen(s.charAt(i))) {
				st.push(s.charAt(i));
			} else {
				if(!st.isEmpty() && isPair(st.peek(), s.charAt(i))) {
					st.pop();
				} else return false;
			}
		}
		return st.isEmpty();
	}
	
	public static void main(String[] args) {
		String s1 = "()({[]})[]";
		String s2 = ")({[]})[]";
		String s3 = "({)}";
		String s4 = "}{";
		String s5 = "{}";
		String s6 = "";
		
		MatchParentheses2 mp = new MatchParentheses2();
		System.out.println(mp.isBalanced(s1)); //true
		System.out.println(mp.isBalanced(s2)); //false
		System.out.println(mp.isBalanced(s3)); //false
		System.out.println(mp.isBalanced(s4)); //false
		System.out.println(mp.isBalanced(s5)); //true
		System.out.println(mp.isBalanced(s6)); //true
	}

}
