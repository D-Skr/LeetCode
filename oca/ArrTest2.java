package oca;

public class ArrTest2 {

    public static void main(String[] args) {
        Double [] arr = new Double[2];
//        System.out.println(arr[0] + arr[1]); // RTE. Exception in thread "main" java.lang.NullPointerException
        System.out.println(arr[0]); 
        //prints null
        
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        //prints Java
    }

}
