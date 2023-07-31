package oca;

public class LoopTest2 {

    public static void main(String[] args) {
        
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               if( j == 1) break;
               System.out.printf("i=%d, j=%d\n", i, j);
            }
        }
        /*
         * prints
         * i=0, j=0
         * i=1, j=0
         * i=2, j=0
         */
        
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               if( j == 1) continue;
               System.out.printf("i=%d, j=%d\n", i, j);
            }
            /*
             * prints
             * i=0, j=0
             * i=0, j=2
             * i=1, j=0
             * i=1, j=2
             * i=2, j=0
             * i=2, j=2
             */
        }
    
        
        for(int i = 0; i < 3; i++) {
           label: for (int j = 0; j < 3; j++) {
               if( j == 1) continue label;
               System.out.printf("label i=%d, j=%d\n", i, j); //prints same
            }
        }
        
        label: for(int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                if( j == 1) continue label; //same output as if( j == 1) break;
                System.out.printf("i=%d, j=%d\n", i, j); 
             }
         }
        
        label: for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               if( j == 1) break label; //exit from both loops to LOC56.
               System.out.printf("i=%d, j=%d\n", i, j); //prints i=0, j=0
            }
        }
    }
}
