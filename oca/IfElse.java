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
    }

}
