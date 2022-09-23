package code_challenges;

import java.util.Scanner;

	// Verification of Password:
	// Must have at least 8 characters
	// Must have at least 1 uppercase letter
	// Must have at least 1 lowercase letter
	// Must have at least 1 number
	
public class Q2PasswordComplexity {
	public static boolean isPasswordComplex(String password) {
		return password.length() > 7 
				&& password.matches(".*[a-z].*") 
				&& password.matches(".*[A-Z].*") 
				&& password.matches(".*\\d.*"); 
				
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String userInput = sc.nextLine();
		System.out.println("Is the password complex? " + isPasswordComplex(userInput));

	}

}
