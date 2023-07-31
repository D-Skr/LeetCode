package oca;

public class LoopTest2 {

    public static void main(String[] args) {
        
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               if( j == 1) break;
               System.out.printf("i=%d, j=%d\n", i, j);
            }
        }

    }

}
