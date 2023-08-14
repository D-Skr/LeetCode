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
        String s4 = "Hello world!"; // goes to String pool
        String s5 = "Hello " + "world!"; // goes to String pool
            //Constant expressions are computed at compile time
            //and treated as literals
        
        String s6 = "Hello " + gimme(); //compiled at runtime and does not get interned
        
        System.out.println(s4 == s5);   //true
        System.out.println(s6 == s5);   //false
        
        System.out.println("~~~~~~~~~~~~~");
        //no changes that is why returns same String -> true
        System.out.println(s1 == s1.replace("Z","z"));  //true
        System.out.println(s1 == s1.trim());    //true
        System.out.println(s1 == s1.substring(0));  //true
        
        System.out.println("~~~~~~~~~~");
        String a = "";
        a = 1 + 10 + a; //a = "11"
        System.out.println(a);
        a += 2; //112
        System.out.println(a);
        a += 'a';   //112a
        System.out.println(a);
        a += true;  //112atrue
        System.out.println(a);
        
    }

}
