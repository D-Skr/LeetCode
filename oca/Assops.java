package oca;

public class Assops {

    public static void main(String[] args) {
        String str = "";
        // '+' works only for String. At least one literal should be String type
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
        
        //
    }

}
