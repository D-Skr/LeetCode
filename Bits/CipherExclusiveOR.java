package Bits;

import java.util.Scanner;

public class CipherExclusiveOr {

    // if you know how to brute force it please let me know!

    static String msg = "";
    static String encMsg = "";
    static int key;
    static final String errorMsg = "Invalid value, please try again";

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

    static void reset() {
        msg = "";
        encMsg = "";
        //key = 0;
    }

    static void optionRun() {
        Scanner scanner = new Scanner(System.in);
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

        System.out.println("Your MAD result is:");
        System.out.println(encode(msg, key));
        reset();
        System.out.println("Please select option 1 - 3");
    }

    public static void main(String[] args) {

        System.out.println("Welcome to MAD Cipher App!");
        System.out.println("You can use absolutelly any languages, numbers and symbols");
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
                optionRun();
                break;

            case ("2"):
                System.out.println("Decryption option selected");
                optionRun();
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
