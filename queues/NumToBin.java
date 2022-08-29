package queues;

import java.util.LinkedList;
import java.util.Queue;

public class NumToBin {
	// transform number to binary and print all numbers till this one
	// Input: 5
	// Output: 1, 10, 11, 100, 101
	
	public static void printBinary(int n) {
		if(n<=0) {
			System.out.println("~~~~~~");
			return;
		}
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		for (int i = 0; i < n; i++) {
			int current = queue.remove();
			System.out.println(current);
			
			queue.add(current * 10);
			queue.add(current * 10 + 1);
		}
		System.out.println("~~~~~~");
	}
	
	public static void main(String[] args) {
		printBinary(2);
		printBinary(3);
		printBinary(-7);
		printBinary(15);
	}

}
