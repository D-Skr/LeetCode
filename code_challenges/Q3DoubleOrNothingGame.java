package code_challenges;

import java.util.Random;
import java.util.Scanner;

public class Q3DoubleOrNothingGame {
	// User starts with 10 points
	// User can take a chance to double their points
	// If he takes a chance, randomness decides if he receive double or loses all
		public static Integer playGame(int points) {
			Random r = new Random();
			if(r.nextBoolean())
				return points *= 2;
			return 0;
		}
	
	public static void main(String[] args) {
		int points = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Your score: " + playGame(points) + ". Type EXIT to exit.");
		if(sc.nextLine() != "exit" || points != 0)
			System.out.println("You lost your points!");
	}
}
