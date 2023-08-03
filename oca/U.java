package oca;

    //which LOCs fail compilation?

//only abstact, final, public and w/o modifier are permitted in top level class
abstract class A {}
final class F {
    static class S {}
    }
public class U {} //should be same as file name because of public modifier
class N {}

//compelation error: illegal modifier for class
//protected class O {}
//private class R {}
//static class S {}