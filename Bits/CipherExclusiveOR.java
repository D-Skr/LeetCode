package Bits;

import java.util.Scanner;

public class CipherExclusiveOr {

    static String msg = "";
    static String encMsg = "";
    static int key;
    static final String errorMsg = "Invalid value, please try again";
    static Scanner scanner = new Scanner(System.in);

    static String encode(String msg, int key) {
        for (int i = 0; i < msg.length(); i++) {
            encMsg += (char) (msg.charAt(i) ^ key);
        }
        return encMsg;
    }

    //decode method works absolutely as encode
    static String decode(String msg, int key) {
        return encode(msg, key);
    }

    static void optionRun() {
        System.out.println("Please enter your text:");
        msg = scanner.nextLine();
        System.out.println("Please enter key in range -2147483648 to 2147483647:");
        try {
            double temp = Double.parseDouble(scanner.nextLine());
            if (temp >= -2147483648 && temp <= 2147483647)
                key = (int) temp;
            else {
                System.out.println(errorMsg);
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println(errorMsg);
            return;
        }

        System.out.println("\nYour MAD result is:");
        System.out.println(encode(msg, key));
        encMsg = "";
        System.out.println("\nPlease select option 1 - 4");
    }
    
    static void bruteForce(String msg) {
        boolean found = false;
        for (int i = 0; i < 150000; i++) {

            encMsg = encode(msg, i);
            if (isValid(encMsg)) {
                System.out.println("\n\nFound key: " + i);
                System.out.println(encMsg);
                found = true;
            }
            else encMsg = "";

            
        }
    }

    static boolean isValid(String text) {
        boolean isValid = false;
        
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.length() > 25)
                return false;
        }
        if (text.contains(". ") 
                || text.contains(", ") 
                || text.contains("! ")
                || text.contains("? ")
                || text.contains(": ")) {
            isValid = true;
        }
        return isValid;
    }
    
    static void optionBruteForceRun() {
        System.out.println("Please enter your text:");
        msg = scanner.nextLine();
        bruteForce(msg);
        encMsg = "";
        System.out.println("\nPlease select option 1 - 4");
    }
 

    public static void main(String[] args) {

        System.out.println("Welcome to MAD Cipher App!");
        System.out.println("You can use absolutelly any languages, numbers and symbols");
        System.out.println("The cipher is omnivorous!");
        System.out.println("\nPlease choose your option:");

        while (true) {
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Brute Force");
            System.out.println("4. EXIT");

            String option = scanner.nextLine();

            switch (option) {
            case ("1"):
                System.out.println("Encryption option selected");
                optionRun();
                break;

            case ("2"):
                System.out.println("Decryption option selected");
                optionRun();
                break;

            case ("3"):
                System.out.println("Brute Force option selected");
                optionBruteForceRun();
                break;

            case ("4"):
                System.out.println("It was fun! See you!");
                scanner.close();
                return;

            default:
                System.out.println("Invalid option, please enter number 1 - 4 only");
                break;
            }
        }

    }

}
