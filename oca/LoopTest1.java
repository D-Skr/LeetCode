package oca;

public class LoopTest1 {

    public static void main(String[] args) {
        //compiler treats these loops as same
        for(;;)break; 
        for(;true;) break;

    }

}
