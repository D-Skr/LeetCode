package oca;

public class DataTypesTwo {

    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = new Integer(i1);
        
        //String s; //comperr: The local variable s may not have been initialized
        String s = null;
        Boolean b = Boolean.valueOf(s);
        System.out.println(b);

    }

}
