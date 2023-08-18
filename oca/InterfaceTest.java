package oca;

import java.io.IOException;

interface I01 {
    void m1();  //same as public abstract void m1();
}

public class InterfaceTest extends Object implements I01 {
    String InterfaceTest;

    protected void m1() {} //m1 is public implicitly in I01, should be public here as well, but no comperr
    
    static void add (double d1, double d2) {
        System.out.println("double"+ (d1 + d2));
    }
    static void add (Double d1, Double d2) throws Exception {
        System.out.println("Double"+ (d1 + d2));
        throw new IOException();
    }
    public static void main(String[] args) {
        System.out.println(123);
        
        //add(10.0, new Double(10));    //comperr The method add(double, double) is ambiguous for the type InterfaceTest
        try {
            add(new Double(10),new Double(10));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String s1 = "asdf";
        String s2 = "dfdasdf";
        System.out.println(s1 = s2);
    }

}
