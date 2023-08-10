package oca;

// what will print? 

public class Tree {
    private void grow() {
        System.out.println("Tree is growing");        
    }
    
    public static void main(String[] args) {
        Tree tree = new Oak();
        tree.grow();
    }

}

class Oak extends Tree {
    protected void grow() {
        System.out.println("Oak is growing");
    }
}


//prints Tree is growing because private method is not polymorphic.  