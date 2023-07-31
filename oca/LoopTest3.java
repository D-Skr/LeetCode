package oca;

import java.util.ArrayList;
import java.util.List;

public class LoopTest3 {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        
//        for(Integer e : list)
//            list.add(2); //runtime error: iteration+modification restricted
        /*
         * Exception in thread "main" java.util.ConcurrentModificationException
         * at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
         * at java.util.ArrayList$Itr.next(ArrayList.java:859)
         * at oca.LoopTest3.main(LoopTest3.java:13)
         */

        //v1
        if(false) //valid
            System.out.println("!");
        
        //v2
        //while(false) //invalid
        //    System.out.println("!"); //comperr
        /*
         * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
         * Unreachable code
         */
        
        //v3
        do {
            System.out.println("!");             
        }
        while(false); //valid
        
        
        //v4 prints 1234
        label: {
            System.out.print("1");
            if (false) break label; 
            System.out.print("2");
        }
        label: 
            if (1 > 0) {
                System.out.print("3");
                if (false) break label; System.out.println("4");
            }
        
        //v5
        int[] arr = {1,2,3};
        for(int e: arr) {} //valid
        for(int i =0; i < 0; i++) {} //valid
        for(;;) break; //valid 
        for(boolean b = true; b; b = !b) {} //valid!
        //for(int i; i < 0; i++) {} //invalid. Comperr
        /*
         * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
         * The local variable i may not have been initialized
         */
    }

}
