package oca;

public class Quantity {
    private boolean flag;
    public void show() {
        int qty = flag ? 1 : 100;
        System.out.println("Hom many " + qty++);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
