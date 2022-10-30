package Bits;

public class ShowBits {
    // show bits of byte
    
    public static void main(String[] args) {
        int t;
        byte val;

        val = -128;
        for (t = 128; t > 0; t  = t/2) {
            if ((val & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }

}
