package oca;

public class Quantity {
    private boolean flag; //dafault value 'false'
    public void show() {
        int qty = flag ? 1 : 100;
        System.out.println("Hom many " + qty++); //100, post increment
    }
    
    public static void main(String[] args) {
        new Quantity().show();
    }

}
