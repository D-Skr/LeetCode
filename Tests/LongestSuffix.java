package Tests;

public class LongestSuffix {
    // String result ="nting";
    
    public static String commonSuffix(String[] arr) {
        StringBuilder result = new StringBuilder();
        int minSize=Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() < minSize) {
                minSize = arr[i].length();
            }
        }
         for(int i = 1; i < minSize; i++) { 
             String s = arr[0];
             boolean skip = false;
             char c = s.charAt(s.length() -i);
             for(int j = 1; j < arr.length; j++) {
                 String s2 = arr[j];
                 if(c != s2.charAt(s2.length() - i)) {
                     skip = true;
                     break;
                 }
             } 
             if(!skip) {
                 result.append(c);
             }
        }
        result.reverse();
        return result.toString();
    }
    
    public static void main(String [] args) {
        String[] name = {"renting", "painting", "denting", "flaunting", "venting"}; 
        System.out.println(commonSuffix(name));

       
    }
}
