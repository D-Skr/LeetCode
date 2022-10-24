package Bits;

import java.util.Scanner;

public class CipherExclusiveOR {

	static String msg = "";
	static String encmsg = "";
	static String decmsg = "";
	static int key;

	static String encode(String msg, int key) {
		for (int i = 0; i < msg.length(); i++) {
			encmsg += (char) (msg.charAt(i) ^ key);
		}
		return encmsg;
	}

	static String decode(String msg, int key) {
		return encode(msg, key);
	}
	
	static void reset() {
		msg = "";
		encmsg = "";
		decmsg = "";
		key = 0;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to MAD Cipher App!");
		System.out.println("You can use absolutelly any languages.");
		System.out.println("The cipher is omnivorous!");

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
				System.out.println("Please enter your text:");
				msg = console.nextLine();
				System.out.println("Please enter key in range -2147483648 to 2147483647:");
				key = Integer.parseInt(console.nextLine());
				System.out.println("Your MAD result is:");
				System.out.println(encode(msg, key));
				reset();
				System.out.println("Please select option 1 - 3");
				break;

			case ("2"):
				System.out.println("Decryption option selected");
				System.out.println("Please enter your text:");
				String msg = console.nextLine();
				System.out.println("Please enter key in range -2147483648 to 2147483647:");
				key = Integer.parseInt(console.nextLine());
				System.out.println("Your MAD result is:");
				System.out.println(encode(msg, key));
				reset();
				System.out.println("Please select option 1 - 3");
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
