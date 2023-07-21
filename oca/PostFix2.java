package oca;

//The answer to Life, the Universe and everything is 43

public class PostFix2 {

    public static void main(String[] args) {
        int a = 42;
        if(a++ == 42) {
            System.out.println("The answer to Life, the Universe and everything is " + a);
        } else {
            System.out.println("The answer to Life, the Universe and everything is " + ++a);
        }
    }

}
