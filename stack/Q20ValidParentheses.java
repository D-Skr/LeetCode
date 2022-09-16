package stack;

import java.util.HashMap;
import java.util.Stack;

public class Q20ValidParentheses {
	//v1
	public static boolean isValid(String s) {
		HashMap<Character,Character> map = new HashMap<>();
		map.put(')','(');
		map.put(']','[');
		map.put('}','{');
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!map.containsKey(c)) {
				stack.push(c);
			} else {
				char top = stack.isEmpty() ? '?' : stack.pop();
				if(top != map.get(c))
					return false;
			}
		}
			
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		String s1 = "()({[]})[]";
		String s2 = ")({[]})[]";
		String s3 = "({)}";
		String s4 = "}{";
		String s5 = "{}";
		String s6 = "";
		
		System.out.println(isValid(s1)); //true
		System.out.println(isValid(s2)); //false
		System.out.println(isValid(s3)); //false
		System.out.println(isValid(s4)); //false
		System.out.println(isValid(s5)); //true
		System.out.println(isValid(s6)); //true

	}

}
