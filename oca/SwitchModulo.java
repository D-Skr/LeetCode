package oca;

public class SwitchModulo {

    public static void main(String[] args) {
        int a = 10;
        Short s = (short)(int)(long)(float)(a % 4.d); //any number of cast. Last one short-> result short too.
        switch(s) {
            case 0:
                System.out.println("Divisible by 4");
                break;
            default: 
                System.out.println("Not divisible by 4"); //prints
                break;
        }
        System.out.println(s);
    }

}
