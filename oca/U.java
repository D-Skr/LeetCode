package oca;

    //which LOCs fail compilation?

abstract class A {}
final class F {}
public class U {} //should be same as file name because of public modifier
class N {}
    //only abstact, final, public and w/o modifier are permitted
protected class O {}
private class R {}
static class S {}