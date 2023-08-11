package oca;

interface Money {
    int cash = 0;
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
        // TODO Auto-generated method stub

    }

}
