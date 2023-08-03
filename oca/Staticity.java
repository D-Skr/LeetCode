package oca;

class Staticity {
    private final static String secret = "A big secret!";
    
    static void test() {
        System.out.println("hi!");
    }
            
    public static void main(String[] args) {
        
        System.out.println(secret);
        
        Inter1.run2();
        
        //Inter2.run2(); //comperr
        //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        //The method run2() is undefined for the type Inter2
        
        Staticity s = new Staticity();
        s = null;
        s.test(); //prints hi! no NPE because of static
        test(); //same result, prints hi!
    }

}

class Hacker extends Staticity {
    //if execute Hacker class
    //it prints "A big secret!"
    //static method was inherited. 
}

interface Inter1{
    static void run2() {
        System.out.println("another secret");
    }
}

interface Inter2 extends Inter1{
    //static method cannot be inherited. Class issue fixed in interface
}

