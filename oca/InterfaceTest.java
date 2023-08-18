package oca;

interface I01 {
    void m1();  //same as public abstract void m1();
}

public class InterfaceTest extends Object implements I01 {

    protected void m1() {} //m1 is public implicitly in I01, should be public here as well, but no comperr
    
    static void add (double d1, double d2) {
        System.out.println("double"+ (d1 + d2));
    }
    static void add (Double d1, Double d2) {
        System.out.println("Double"+ (d1 + d2));
    }
    public static void main(String[] args) {
        System.out.println(123);
        
        //add(10.0, new Double(10));    //comperr The method add(double, double) is ambiguous for the type InterfaceTest
        

    }

}
