package oca;

/*
 * What is the result?
 * kk = 0, kk = 2, kk = 0
 * kk = 0, kk = 2, kk = 2
 * kk = 0, kk = 2, kk = 4
 * Compilation fails.
 */


public class Looper {

    public static void main(String[] args) {
        for(int kk = 0; kk < 4; kk++) {
            System.out.print("kk = " + kk + ", ");
            kk = kk + 1;
        }
       // System.out.print("kk = " + kk + ", "); //local var kk invisible outside block.
    }
}
