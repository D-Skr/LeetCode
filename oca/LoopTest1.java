package oca;

public class LoopTest1 {

    public static void main(String[] args) {
        //compiler treats these loops as same
        for(;;)break; 
        for(;true;) break;
        
        //same loop in different valid 
        //v1
        int i1, s1, count1 = 10;
        for (i1 = 0, s1 = 0; i1 < count1; i1++) { s1 += i1; }
        //v2
        int i2, s2, count2 = 10;
        for (i2 = 0, s2 = 0; i2 < count2; s2 += i2, i2++);
        //v3
        int s3 = 0, count3 = 10;
        for (i1 = 0, s1 = 0; i1 < count1; i1++) { s1 += i1; }
        //v4
        int i1, s1, count1 = 10;
        for (i1 = 0, s1 = 0; i1 < count1; i1++) { s1 += i1; }
        //v5
        int i1, s1, count1 = 10;
        for (i1 = 0, s1 = 0; i1 < count1; i1++) { s1 += i1; }
        //v6
        int i1, s1, count1 = 10;
        for (i1 = 0, s1 = 0; i1 < count1; i1++) { s1 += i1; }

        
    }

}
