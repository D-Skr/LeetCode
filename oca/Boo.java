package oca;

public class Boo {

    public static void main(String[] args) {
        int a,b = 0;
        boolean boo;
        a = (boo = true) ? b = 10 : 11; // b=10 -> a = b;
        System.out.println(a + " " + boo + " " + b); //10 true 10
        System.out.println(-11%2);
    }

}
