package oca;

public class StaticTest1 {
    
    static int a = 42;
    
    public static void main(String[] args) {
        StaticTest1 st = new StaticTest1();
        st.a++;
        StaticTest1.a++;
        st.a--;
        
    }

}
