package oca;

/* 
 * what is the result?
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