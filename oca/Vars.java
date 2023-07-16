package oca;

public class Vars {
    int z;
    public static void main(String[] args){
        Vars obj = new Vars();
        int z = 3;
        System.out.print(z);
        obj.doStuff();
        System.out.print(z);
        System.out.print(obj.z);
    }
    
    void doStuff() {
        int z = 2;
        doStuff(z);
        System.out.print(z);
    }
    
    void doStuff(int zzz) {
        z = 1;
    }
}
