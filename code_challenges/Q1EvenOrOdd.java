package code_challenges;

import java.util.Scanner;

public class Q1EvenOrOdd {
	
	public static boolean isEven(int n) {
		return n%2==0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int userNum = scanner.nextInt();
		System.out.println("Is the number " + userNum + " even? " + isEven(userNum));
		scanner.close();
	}
}
