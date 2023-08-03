package oca;

    //which LOCs fail compilation?

//only abstract, final, public and w/o modifier are permitted in top level class
abstract class A {}
final class F {
    static class S {} //static modifier is permitted for nested (not top level) class
    }
public class U { //should be same as file name because of public modifier

    //constructors
    //U(); //comperr
    void U() {} //just a method, not a constructor
    //abstact U() {} //comperr. Constructor cannot be abstract
    //protected U() {} //valid
    //private U() {} //valid, no errors but useless. Constructor should be public
    U() {}
}
    
class N {}

//compelation error: illegal modifier for class
//protected class O {}
//private class R {}
//static class S {}