package oca;

public class PostFix {

    static int incr1(int x) {
        return x++;
    }
    
    static int incr2(int x) {
        x++;
        return x;
    }
    public static void main(String[] args) {
        int a, b, c;
        a = b = c = 0;
        
        System.out.println(a++);
        System.out.println(a);
        System.out.println(incr1(b));
        System.out.println(incr2(c));

        System.out.println(incr1(b));
        System.out.println(incr1(b));
        System.out.println(incr1(b));
    }

}
