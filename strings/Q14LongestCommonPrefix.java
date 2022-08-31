package strings;

import java.util.Arrays;

public class Q14LongestCommonPrefix {

	//14. Longest Common Prefix
	
    public static String longestCommonPrefix(String[] strs) {
        //sort array and compare first and last words,
        //return the common beginning part as a longest prefix
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        String first = strs[0];
        String last = strs[strs.length - 1];
        for(int i=0; i < first.length(); i++){
            if(first.charAt(i) == last.charAt(i))
                sb.append(first.charAt(i));
            else break;
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
		
		String[] s1 = {"flower","flow","flight"};
		String[] s2 = {"string","soap","super"};
		String[] s3 = {"string","apple","super"};
		
		System.out.println(longestCommonPrefix(s1)); // fl
		System.out.println(longestCommonPrefix(s2)); // s
		System.out.println(longestCommonPrefix(s3)); // ""
		System.out.println(longestCommonPrefix(s2)); // s
		
	}

}
