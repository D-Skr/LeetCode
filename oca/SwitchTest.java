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
//        case i2:        //Comp err. Case expressions must be a constant expressions
//            System.out.println("!");
        }
        
        //v4
        int i11 = 10;
        final int i22 = 20;
        switch(i11) {        
            case i22:        //works fine because it is constant
                System.out.println("!");
        }
        
        //v5 wrappers do not work with switch
        Integer i3 = new Integer(10);
        final Integer i4 = new Integer(20); //Switch requires unboxing which happens in runtime
        switch(i3) {        
//          case i4:        //Comp error. Switch requires primitive for constant during compilation, not runtime
//            System.out.println("!");
        
        //no identical case values are allowed
            case 100:
                System.out.println("!!");
//            case 1_0_0:     //100. Comp error, Duplicate case
//                System.out.println("!!");
//            case 90+10:     //100. Comp error, Duplicate case
//                System.out.println("!!");
        }
        
        //v6 valid switch with empty body.
        switch(a) {}
        
        //v7 TCF is one operator, can be used without {} in do-while
//        do      //compiles just fine
//            try {}
//            catch (NullPointerException npe){}
//            finally {}
//        while(true);
        
        //v8 others are not one operator, cannot be used without {} in do-while
        do 
            System.out.println("");
            // System.out.println("2"); //Comp error. Syntax error, insert "while ( Expression ) ;" to complete DoStatement
        while(true);
    }

}
