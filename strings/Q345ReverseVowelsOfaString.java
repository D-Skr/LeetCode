package strings;

public class Q345ReverseVowelsOfaString {
	
	//345. Reverse Vowels of a String
	//solution with 2 pointers
	
	public static String reverseVowels(String s) {
		int i = 0;
		int j = s.length() - 1;
		char[] chArr = s.toCharArray();
		while (i<j) {
			if (isVowel(chArr[i]) && isVowel(chArr[j])) {
				//swap if both are vowel
				char temp = chArr[i];
				chArr[i] = chArr[j];
				chArr[j] = temp;
				i++;
				j--;
			} else if (!isVowel(chArr[i])) i++;
			else if (!isVowel(chArr[j])) j--;
		}
			return new String(chArr);
	}
	
    static boolean isVowel(char c) { // check if char is vowel
        return ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||
        		c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'));
    }
    
	public static void main(String[] args) {
		
		System.out.println(reverseVowels("Hello")); //Holle
		System.out.println(reverseVowels("Let's go yes/no")); //Lot's ge yos/ne
		System.out.println(reverseVowels("aoeu")); //ueoa
		System.out.println(reverseVowels("oeu")); //ueo

	}

}
