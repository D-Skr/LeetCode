package oca;

public class TestEquality {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        System.out.println(str1 == str2);   //true
        System.out.println(str1 == str3);   //false
        System.out.println(str1.equals(str2));  //true
        System.out.println(str1.equals(str3));  //true
        
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb1 == sb2);     //false
        System.out.println(sb1.equals(sb2));  //false
        System.out.println(sb1.toString().equals(sb2.toString()));  //true
        
        TestEquality te1 = new TestEquality();
        TestEquality te2 = new TestEquality();
        
        System.out.println(te1 == te2);
        System.out.println(te1.equals(te2));
    }

}
