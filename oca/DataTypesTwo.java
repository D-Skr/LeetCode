package oca;

public class DataTypesTwo {

    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = new Integer(i1);
        
        //String s; //comperr: The local variable s may not have been initialized
        String s = null;    //valid
        Boolean b = Boolean.valueOf(s);
        System.out.println(b);  //false
        
        char c = '7';
        int d = c;
        System.out.println(c);  //7
        System.out.println(d);  //55
        
        
        int a = 7;
        boolean res = a++ == 7 && ++a == 9 || a++ == 9;
        System.out.println("a = " + a);
        System.out.println("res = " + res);

    }

}
