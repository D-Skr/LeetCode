package oca;

public class StringTest2 {

    public static void main(String[] args) {
        final String fName = "James";
        String lName = "Gosling";
        String name1 = fName + lName;
        String name2 = fName + "Gosling";
        String name3 = "James" + "Gosling";
        System.out.println(name1 == name2); //false
        System.out.println(name2 == name3); //true
        
        System.out.println("~~~~~~~~~~");
        
        int a = 2;
        boolean res = false;
        res = a++ == 2 || --a == 2 && --a == 2;
        System.out.println(a);  //3

    }

}
