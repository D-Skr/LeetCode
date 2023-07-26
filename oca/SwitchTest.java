package oca;

public class SwitchTest {

    public static void main(String[] args) {
       
        byte a = 10;
        //v1
        switch(a) {
        case 10:
            System.out.println("!");
//        case a: //Comp err. Case expressions must be a constant expressions 
//            System.out.println("!");
        
//        case 128:       //Comp error. Type mismatch: cannot convert from int to byte
//            System.out.println("!");     
        }
        
        //v2
        char ch = 'a';
        switch(ch) {        //works fine
        case 10:
            System.out.println("!");
        case 128:       //works fine
            System.out.println("!"); 
        }
        
        //v3
        int i1 = 10;
        int i2 = 20;
        switch(i1) {        
        case i2:        //Comp err. Case expressions must be a constant expressions
            System.out.println("!");
        }
    }

}
