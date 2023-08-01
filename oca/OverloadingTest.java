package oca;

public class OverloadingTest {
    
    static void run(byte arg) {
        System.out.println("byte");
    }
    
    static void run(long l) {
        System.out.println("long");
    }
    
    static void run(Integer arg) {
        System.out.println("Integer");
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
