package code_challenges;

import java.util.Scanner;

public class Q1EvenOrOdd {
	
	public static boolean isEven(int n) {
		if(n%2==0) 
			return true;
		else return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int userNum = scanner.nextInt();
		System.out.println("Is the number " + userNum + " even? " + isEven(userNum));
	}

}
