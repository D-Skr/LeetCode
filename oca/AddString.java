package oca;

public class AddString {

    public static void main(String[] args) {
        System.out.println("1 + 2 = " + 3 + 4);
        System.out.println("1 + 2 = " + (3) + (4));
        System.out.println("1 + 2 = " + (3 + 4));

        /*
         * 1 + 2 = 34
         * 1 + 2 = 34
         * 1 + 2 = 7
         */
        
        System.out.println(1 + 2 + 3 + "!"); //6!
        System.out.println(1 + 2 * 3 + "!"); //7!
        System.out.println("!" + 1 + 2 * 3 + "!"); //!16! because '*' has higher priority then '+'
    //  System.out.println("!" + 1 + 2 - 3 + "!"); //comp error
    }

}
