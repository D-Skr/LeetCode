package oca;

public class SbTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(100);
        System.out.println(sb.length() + " : " + sb.toString().length());
        System.out.println(sb.toString());
        //prints 0 : 0
        StringBuilder sb2 = new StringBuilder("sb");
//        System.out.println(sb2.append(null)); //comperr
        System.out.println(sb2); //prints sb
    }

}
