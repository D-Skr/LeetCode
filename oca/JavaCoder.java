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
        Money m = new LocalCurrency();
        m.earn(5000);
        m.spend(200);
        System.out.println("left in the pocket " + m.cash);
        //prints 0
        
        //v2
        //LocalCurrency m = new LocalCurrency();
        //prints 4900.
    }

}
