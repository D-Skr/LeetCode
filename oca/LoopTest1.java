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
        int i1, s1, count1 = 10;
        for (i1 = 0, s1 = 0; i1 < count1; i1++) { s1 += i1; }
        //v3
        int i1, s1, count1 = 10;
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
