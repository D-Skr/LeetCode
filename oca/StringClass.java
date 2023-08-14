package oca;

public class StringClass {
    static String gimme() {
        return "world!";
    }
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = new String(new StringBuilder("Hello"));
        System.out.println("Hello" == s1); //true
        System.out.println(s1 == s2); //false
        System.out.println(s3 == s2); //false
        System.out.println(s1 == "Hello!".substring(0,5)); //false
        System.out.println(s1 == "Hello".substring(0,5)); //true
        
        System.out.println("~~~~~~~~~~~");
        String s4 = "Hello world!";
        String s5 = "Hello " + "world!"; //Constant expressions are computed at compile time
            //and treated as literals
        
        String s6 = "Hello " + gimme(); //compiled at runtime and does not get interned
        
        System.out.println(s4 == s5);   //true
        System.out.println(s6 == s5);   //false
        
    }

}
