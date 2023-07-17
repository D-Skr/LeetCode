package oca;

/*
 * What is the result?
 * 3231
 * 3230
 * 3131
 * 3130
 */

public class Vars {
    int x;
    public static void main(String[] args){
        Vars obj = new Vars();
        int x = 3;
        System.out.print(x);
        obj.doStuff();
        System.out.print(x);
        System.out.print(obj.x);
    }
    
    void doStuff() {
        int x = 2;
        doStuff(x);
        System.out.print(x);
    }
    
    void doStuff(int xx) {
        x = 1;
    }
}
