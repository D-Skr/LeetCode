package Bits;

public class ShowBits {
    // show bits of byte
    
    static void showBits(byte val) {
        for (int t = 128; t > 0; t  = t/2) {
            if ((val & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
    
    public static void main(String[] args) {
        byte val = -1;
        showBits(val);
    }

}
