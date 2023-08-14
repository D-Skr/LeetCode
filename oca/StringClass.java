package oca;

public class StringClass {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = new String(new StringBuilder("Hello"));
        System.out.println("Hello" == s1); //true
        System.out.println(s1 == s2); //false
        System.out.println(s3 == s2); //false
        System.out.println(s1 == "Hello!".substring(0,5)); //false
        System.out.println(s1 == "Hello".substring(0,5)); //true
        

    }

}
