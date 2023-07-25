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
        System.out.println(sb1.toString().equals(str1));  //true
        
        TestEquality te1 = new TestEquality();
        TestEquality te2 = new TestEquality();
        
        System.out.println(te1 == te2); //false
        System.out.println(te1.equals(te2)); //false because Super.equals()
        
        Boolean boo = new Boolean("false");
        String str = new String("false");
        
        //System.out.println(boo == str); //comp error

        //cast to Object v1
        Object[] array = {boo, str};
        System.out.println(array[0] == array[1]); // prints false, no errors.
        
        //cast to Object v2. Compiler always looks at reftypes and never cares about actypes
        Object booo = new Boolean("false");
        Object strr = new String("false");
        System.out.println(boo == strr); //prints false
        
        System.out.println(null == null); //true
    }
  
}
