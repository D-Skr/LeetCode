package oca;

public class Assops {

    public static void main(String[] args) {
        String str = "";
        // '+' works only for String. At least one operand should be String type
        System.out.println(str);
        //str = null +'a'; //invalid
        str = str +'a';
        System.out.println(str);
        str += null;
        System.out.println(str);
        //str += null + 'a'; //invalid
        str += 'a';
        System.out.println(str);
        str = str + null + 'a';
        System.out.println(str);
        
        //IMPORTANT! Types of the operands are determined at compile time.
        Object sobj = "";
        String s = "";
        //s = sobj + 'a'; //invalid
        s = (String)sobj + 'a'; //valid
        
        //Empty statement
        if(1 > 0); //valid
    }

}
