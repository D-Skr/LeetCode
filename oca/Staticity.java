package oca;

class Staticity {
    private final static String secret = "A big secret!";
            
    public static void main(String[] args) {
        
        System.out.println(secret);

    }

}

class Hacker extends Staticity {
    //if execute Hacker class
    //it prints "A big secret!"
}