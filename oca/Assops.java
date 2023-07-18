package oca;

public class Assops {

    public static void main(String[] args) {
        String str = "";
        //str = null +'a';
        str = str +'a';
        str += null;
        //str += null + 'a';
        str += 'a';
        str = str + null + 'a';
        System.out.println(str);
    }

}
