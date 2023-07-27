package oca;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arr = new int[3]; //arr with size 3
        int arr4[] = new int[3]; //arr with size 3
        //int[] arr5[] = new int[3]; //Comperr. Type mismatch: cannot convert from int[] to int[][]
        int[] arr5[] = new int[3][]; //2-dim arr with size 3 of first dimension
        
        //compiler counts size
        int[] arr2 = new int[] {42,43,-3223};
 
        //comperr. Cannot define dimension expressions when an array initializer is provided
        //int[] arr3 = new int[3] {42,43,-3223}; 
        
        int[] arr3 = {};
        System.out.println(arr3); // prints [I@2a139a55, 
        //[I - 1-dimensional int array,
        //2a139a55 - hash
        // if [[I - 2 dimensional int array
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
