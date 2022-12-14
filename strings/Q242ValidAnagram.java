package strings;

public class Q242ValidAnagram {
    	public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] charCount = new int[26];
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        
        //v.1 with sort
        //Arrays.sort(ch1);
        //Arrays.sort(ch2);
        //return Arrays.equals(ch1,ch2);
        
        //v.2
        for(int i = 0; i < ch1.length; i++){
            charCount[ch1[i]-'a']++;
            charCount[ch2[i]-'a']--;
        }
        for(int i = 0; i < charCount.length; i++){
            if(charCount[i] != 0) return false;
        }
        return true;
    }
	public static void main(String[] args) {
		String s1 = "anagram";
		String s2 = "naagram";
		String s3 = "ooogram";
		System.out.println(isAnagram(s1,s2)); //true
		System.out.println(isAnagram(s2,s3)); //false
	}

}
