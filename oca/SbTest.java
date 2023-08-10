package oca;

public class SbTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(100);
        System.out.println(sb.length() + " : " + sb.toString().length());
        System.out.println(sb.toString());
        //prints 0 : 0
    }

}
