package oca;

public class ArrayTest {
    static int[] arrr1;
    static int[] arrr2 = {};
    
    public static void main(String[] args) {
        System.out.println(arrr1);   //prints null
        System.out.println(arrr2);   //prints [I@2a139a55
        
        int[] arr = new int[3]; //arr with size 3
        // int[1] arr0; //comperr. Syntax error on token "1", delete this token
        
        int arr4[] = new int[3]; //arr with size 3
        System.out.println("arr4[1]: " + arr4[1]); //prints default value 0
        //int[] arr5[] = new int[3]; //Comperr. Type mismatch: cannot convert from int[] to int[][]
        int[] arr5[] = new int[3][]; //2-dim arr with size 3 of first dimension
        System.out.println(arr5); //[[I@2a139a55
        
        //compiler counts size
        int[] arr2 = new int[] {42,43,-3223};
 
        //comperr. Cannot define dimension expressions when an array initializer is provided
        //int[] arr3 = new int[3] {42,43,-3223}; 
        
        int[] arr3 = {};
        System.out.println(arr3); // prints [I@2a139a55, 
        //[I - 1-dimensional int array,
        //2a139a55 - hash
        // if [[I - 2 dimensional int array
        
        Integer[] arrInt = new Integer[5];
        System.out.println("arrInt[3]: " + arrInt[3] ); //prints null. No NPE
    }
    /*
     * 9 types in class descriptor:
     * [B - byte
     * [S - short
     * [I - integer
     * [J - long
     * [F - float
     * [D - double
     * [C - char
     * [Z -boolean
     *  and
     * [L - reftypes
     */
   
}
