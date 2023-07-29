package oca;

public class LoopTest1 {

    public static void main(String[] args) {
        //compiler treats these loops as same
        for(;;)break; 
        for(;true;) break;
        
        //same loop in different valid 
        int count = 10;
        //v1
        int i1, s1;
        for (i1 = 0, s1 = 0; i1 < count; i1++) { s1 += i1; }
        //v2
        int i2, s2;
        for (i2 = 0, s2 = 0; i2 < count; s2 += i2, i2++);
        //v3
        int s3 = 0;
        for (int i3 = 0; i3 < count; s3 += i3++);
        //v4
        int i4 = 0, s4 = 0;
        for (i1 = 0, s1 = 0; i1 < count; i1++) { s1 += i1; }
        //v5
        int i1, s1;
        for (i1 = 0, s1 = 0; i1 < count; i1++) { s1 += i1; }
        //v6
        int i1, s1;
        for (i1 = 0, s1 = 0; i1 < count; i1++) { s1 += i1; }

        
    }

}
