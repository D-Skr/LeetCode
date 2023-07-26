package oca;

public class SwitchTest {

    public static void main(String[] args) {
       
        byte a = 10;
        
        switch(a) {
        case 10:
            System.out.println("!");
//        case a: //Comp err. Case expressions must be a constant expressions 
//            System.out.println("!");
        
//        case 128:       //Comp error. Type mismatch: cannot convert from int to byte
//            System.out.println("!");     
        }
        
        char ch = 'a';
        switch(ch) {        //works fine
        case 10:
            System.out.println("!");
        case 128:       //works fine
            System.out.println("!"); 
        }
    }

}
