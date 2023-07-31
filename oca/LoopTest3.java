package oca;

import java.util.ArrayList;
import java.util.List;

public class LoopTest3 {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        
        for(Integer e : list)
            list.add(2); //runtime error
        /*
         * Exception in thread "main" java.util.ConcurrentModificationException
         * at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
         * at java.util.ArrayList$Itr.next(ArrayList.java:859)
         * at oca.LoopTest3.main(LoopTest3.java:13)
         */

    }

}
