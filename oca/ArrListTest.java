package oca;

import java.util.ArrayList;
import java.util.List;

public class ArrListTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(16);
        list.add(null);
        
        for(int i = 0; i < list.size(); i++) System.out.print(list.get(i));
        for(Integer i : list) System.out.print(i); //prints 16null16null
        
        
        for(int i : list) System.out.print(i);
        //prints
        //16nullException in thread "main" 16null16java.lang.NullPointerException
        //RTE becaus method is unboxing Integer i
        // public int intValue(null) throws NPE

    }

}
