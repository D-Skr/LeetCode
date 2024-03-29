package oca;

interface Money {
    int cash = 0; //implicit static final, not overriden. 
    abstract void earn(int amount);
    public void spend(int amount);
}

class LocalCurrency implements Money{
    int cash = 100;
    public void earn(int amount) {
        cash = cash + amount;
    }
    public void spend(int amount) {
        cash = cash - amount;
    }
}

public class JavaCoder {

    public static void main(String[] args) {
        //v1
        Money m1 = new LocalCurrency();
        m1.earn(5000);
        m1.spend(200);
        System.out.println("v1. left in the pocket " + m1.cash);
        //prints 0
        
        //v2
        LocalCurrency m2 = new LocalCurrency();
        m2.earn(5000);
        m2.spend(200);
        System.out.println("v2. left in the pocket " + m2.cash);
        //prints 4900.
    }

}
