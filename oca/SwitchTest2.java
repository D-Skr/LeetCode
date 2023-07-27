package oca;
//where comperr?
public class SwitchTest2 {
    int test;
    int a = 10; //not final!
    int run() {return 42;}
    void switchMe() {
        switch( run() ) {}  //line1
        switch( test ) {    //line2
      //      case a:         //line3 -> comperr
            default:
        }
    }
}
