package oca;

import java.util.ArrayList;
import java.util.List;

public class ArrTest2 {

    public static void main(String[] args) {
        Double [] arr = new Double[2];
//        System.out.println(arr[0] + arr[1]); // RTE. Exception in thread "main" java.lang.NullPointerException
        System.out.println(arr[0]); 
        //prints null
        
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        //prints Java
        
        List<String> list = java.util.Arrays.asList("one","two"); //asList return immutable list
        System.out.println(list.toString()); //[one, two]
        
        //list.add("three"); //RTE: java.lang.UnsupportedOperationException
        
        List list2 = new ArrayList();   //valid
        List list3 = new ArrayList<>(); //valid
        //List<> list4 = new ArrayList<>(); //comperr: ncorrect number of arguments for type List<E>
        List<String> list5 = new ArrayList<>(); //valid and correct
    }

}
