package oca;

public class Tree {
    private void grow() {
        System.out.println("Tree is growing");        
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}

class Oak extends Tree {
    protected void grow() {
        System.out.println("Oak is growing");
    }
}
