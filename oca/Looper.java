package oca;



public class Looper {

    public static void main(String[] args) {
        for(int kk = 0; kk < 4; kk++) {
            System.out.print("kk = " + kk + ", ");
            kk = kk + 1;
        }
        System.out.print("kk = " + kk + ", ");
    }
}
