package oca;

public class BoolArray {

    public static void main(String[] args) {
        Boolean[] barr = new Boolean[3];
        barr[0]= new Boolean(Boolean.parseBoolean("tRUE"));
        barr[1]= new Boolean("True");
        barr[2]= new Boolean(false);
        System.out.println(barr[0] + " " + barr[1] + " " + barr[2]);

    }

}
