package oca;

    //which LOCs fail compilation?

//only abstract, final, public and w/o modifier are permitted in top level class
abstract class A {}
final class F {
    static class S {} //static modifier is permitted for nested (not top level) class
    
    int i ='5';
    Double [] arr = new Double[2];
    //double [] arr2 = new int[2]; //comperr
    StringBuilder sb = new StringBuilder();
    //sb.append(null); //comperr 
    }
public class U { //should be same as file name because of public modifier

    //constructors
    //U(); //comperr
    void U() {} //just a method, not a constructor. Constructor has no return type
    //abstact U() {} //comperr. Constructor cannot be abstract
    //protected U() {} //valid
    //private U() {} //valid, no errors but useless. Constructor should be public
    U() {} //valid constuctor
    //public U() {} //valid constructor
}
    
class N {
    public N() {}   //valid but useless. Class N is invisible outside package, constructor too
}

//compelation error: illegal modifier for class
//protected class O {}
//private class R {}
//static class S {}