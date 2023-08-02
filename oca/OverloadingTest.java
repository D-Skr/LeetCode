package oca;

public class OverloadingTest {
    
    static void run(byte arg) {
        System.out.println("byte");
    }
    
//    static void run(long l) {
//        System.out.println("long");
//    }
    
//    static void run(Integer arg) {
//        System.out.println("Integer");
//    }
    
    static void run(int... args) {
        System.out.println("var args");
    }
    
    public static void main(String[] args) {

        run(); 
        /*
         * prints
         * 1. long
         * 2. Integer
         * 2. var arg
         */
    }

}
