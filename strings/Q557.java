package strings;

public class Q557 {
	//557. Reverse Words in a String III
	
    public static String reverseWords(String s) {
        //v.1 failed. This 1-line code reverse whole string, not each word.
        //return new StringBuilder(s).reverse().toString();
        
        //v.2 passed. Working brute force O(N^2)
        // String[] words = s.split(" ");
        // StringBuilder rs = new StringBuilder();
        // for(String word : words){
        //     StringBuilder rw = new StringBuilder();
        //     for(int i = word.length()- 1; i >= 0; i--){
        //         rs.append(word.charAt(i));
        //         }
        //     rs.append(rw).append(" ");
        // }
        // return rs.toString().trim();
        
        //v.3 passed. O(N)
        String[] words = s.split(" ");
        StringBuilder rs = new StringBuilder();
        for(String word : words){
            StringBuilder rw = new StringBuilder(word).reverse();
            rs.append(rw).append(" ");
        }
        return rs.toString().trim();
    
    }

	public static void main(String[] args) {
		
		System.out.println(reverseWords("123adsfadsfAd  faadfA asSDFafa"));
		
	}

}
