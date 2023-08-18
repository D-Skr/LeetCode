package oca;

interface I01 {
    void m1();
}

public class InterfaceTest extends Object implements I01 {

    protected void m1() {} //m1 is public implicitly in I01, should be public here as well, but no comperr
    
    public static void main(String[] args) {
        System.out.println(123);

    }

}
