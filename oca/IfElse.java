package oca;

public class IfElse {

    public static void main(String[] args) {
        //if(boolean bb = true) System.out.println(bb); //comp error
        
        boolean b;
        Boolean boo;
        Boolean booo;
        if (b = true) System.out.println(b);
        if (boo = Boolean.TRUE) System.out.println(boo);
        if (booo = true) System.out.println(booo);
        
        label: if (true) break label; //valid, not endless loop
        System.out.println("if with label");
        
        //while(false) System.out.println("comp error - unreachable code");
        if(false) System.out.println("works fine");
        //while(!true) System.out.println("comp error - unreachable code");
        if(!true) System.out.println("works fine");
        b = false;
        while(b) System.out.println("works fine");
        final boolean bf = false;
        //while(bf) System.out.println("comp error - unreachable code");
        if(bf) System.out.println("comp error - unreachable code");
       
        /*invalid. Neither if nor else branch accepts a variable declaration
         * 
        if(1>0)
            String s1 = "1 > 0";
        else 
            String s2 = "?!";
            */
    }

}
