package Bits;

import java.util.Scanner;

public class CipherExclusiveOR {
	
	static String msg = "Привет! Пук.";
	static String encmsg = "";
	static String decmsg = "";
	int key;
	
	String encode(String msg, int key){
		for(int i = 0; i < msg.length(); i++) {
			encmsg += (char)(msg.charAt(i) ^ key);
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
		
		while(true) {
			Scanner console = new Scanner(System.in);
			System.out.println("Please choose your option:");
			System.out.println("1. Encrypt");
			System.out.println("2. Decrypt");
			System.out.println("3. EXIT");
		}


	}

}
