package oca;

public class Switcher {

    public static void main(String[] args) {
        final String str = "String ";
        switch( str.trim() + "!") {
        case "String " + "!":
            System.out.println("String !");
            break;
        case "String" + "!":
            System.out.println("String!");
            break;
        }
        //prints String!
    }

}
