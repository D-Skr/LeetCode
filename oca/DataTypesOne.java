package oca;

/* 
 * what is the result?
 * 21.0 32.0 107.0 43.0
 * 21.0 32.0 a10 43.0
 * Compilation fails
 * An exception is thrown at run time
 */
public class DataTypesOne {

    public static void main(String[] args) {
        double[] darr = {11,22.0,'a',33.0f};
        for (double e : darr) {
            e = e + 10;
            System.out.println(e + " ");
        }

    }

}
