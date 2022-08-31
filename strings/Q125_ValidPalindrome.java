package strings;

public class Q125_ValidPalindrome {
	
	// 125. Valid Palindrome
	
    public static boolean isPalindrome(String s) {
        
        //v.1
        //StringBuilder normalized = new StringBuilder(s.replaceAll("[^A-Za-z0-9]","").toLowerCase());
        //System.out.println(normalized);
        // for(int i = 0; i < normalized.length()/2; i++){
        //     if(normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) return false;
        // }
        // return true;
        
        //v.2 with 2 pointers
    	StringBuilder s2 = new StringBuilder(s.replaceAll("[^A-Za-z0-9]","").toLowerCase());
    	int left = 0;
    	int right = s2.length() - 1;
    	while (left < right) {
    		if (s2.charAt(left) != s2.charAt(right)) return false;
    		left++;
    		right--;
    	}
    	return true;
    	
    	//v.3
//        String normalized = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
//        StringBuilder rev = new StringBuilder(normalized);
//        return normalized.equals(rev.reverse().toString());
    }
    
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("aCara mara: c a")); //true
		System.out.println(isPalindrome("0P")); //false
		System.out.println(isPalindrome("1a1")); //true
		System.out.println(isPalindrome(" ")); //true
		System.out.println(isPalindrome("12.opachki")); //true

	}

}
