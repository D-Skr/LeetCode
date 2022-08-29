package stack;

import java.util.Stack;

public class NextGreaterElement {
	//return next greater number of the array. Solution with using stack
	//input: {16,7,2,15}
	//output: 16->-1
	//7->15
	//2->15
	//15->-1
	public static void printNextGreaterElement(int[] arr) {
		if(arr.length == 0) {
			System.out.println("~~~~");
			return;
		}
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);
		
		for(int i = 1; i < arr.length; i++) {
			int next = arr[i];
			if(!stack.isEmpty()) {
				int popped = stack.pop();
				while (popped < next) {
					System.out.println(popped + " -> " + next);
					if(stack.isEmpty()) break;
					popped = stack.pop();
				}
				if(popped > next) {
					stack.push(popped);
				}
			}
			stack.push(next);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop() + " -> " + -1);
		}
	}
	
	public static void main(String[] args) {
		
		printNextGreaterElement(new int[] {16,7,2,15});
	}

}
