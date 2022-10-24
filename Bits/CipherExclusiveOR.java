package Bits;

import java.util.Scanner;

public class CipherExclusiveOR {

	static String msg = "Привет! Пук.";
	static String encmsg = "";
	static String decmsg = "";
	int key;

	String encode(String msg, int key) {
		for (int i = 0; i < msg.length(); i++) {
			encmsg += (char) (msg.charAt(i) ^ key);
		}
		return encmsg;
	}

	String decode(String msg, int key) {
		return encode(msg, key);
	}

	public static void main(String[] args) {
		CipherExclusiveOR ceo = new CipherExclusiveOR();

		System.out.println("Welcome to Mad Cipher App!");
		System.out.println("You can use absolutelly any languages.");
		System.out.println("The Mad cipher is omnivorous!");

		while (true) {
			Scanner console = new Scanner(System.in);
			System.out.println("Please choose your option:");
			System.out.println("1. Encrypt");
			System.out.println("2. Decrypt");
			System.out.println("3. EXIT");

			String option = console.nextLine();

			switch (option) {
			case ("1"):
				System.out.println("Encryption option selected");

				break;

			case ("2"):
				System.out.println("Decryption option selected");

				break;

			case ("3"):
				System.out.println("It was fun! See you!");
				console.close();
				return;

			default:
				System.out.println("Invalid option, please enter number 1 - 3 only");
				break;
			}
		}

	}

}
