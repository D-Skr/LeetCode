package hashmap;

import java.util.HashMap;
import java.util.Map;

/*This solution uses two HashMap to count the frequency of each character
 *  in both the word and the note. Then for each word, it checks if the 
 *  characters in the word are all present in the note, and their 
 *  frequency is less or equal to the note's frequency. 
 *  If this is true for a word, that word is returned as the result. 
 *  If no word is found, it returns '-'. */
public class ScrambledWordFinder {

    public static String find(String[] words, String note) {
        for (String word : words) {
            Map<Character, Integer> wordMap = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
            }

            Map<Character, Integer> noteMap = new HashMap<>();
            for (int i = 0; i < note.length(); i++) {
                char c = note.charAt(i);
                noteMap.put(c, noteMap.getOrDefault(c, 0) + 1);
            }

            boolean flag = true;
            for (char c : wordMap.keySet()) {
                if (!noteMap.containsKey(c) || wordMap.get(c) > noteMap.get(c)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return word;
            }
        }

        return "-";
    }

    public static void main(String[] args) {
        String[] words = {"baby", "referee", "cat", "dada", "dog", "bird", "ax", "baz"};
        String note1 = "ctay";
        System.out.println(find(words, note1)); // should return "cat"

        String note2 = "bcanihjsrrrferet";
        System.out.println(find(words, note2)); // should return "cat"

        String note3 = "tbaykkjlga";
        System.out.println(find(words, note3)); // should return "-"

        String note4 = "bbbblkkjbaby";
        System.out.println(find(words, note4)); // should return "baby"

        String note5 = "dad";
        System.out.println(find(words, note5)); // should return "-"

        String note6 = "breadmaking";
        System.out.println(find(words, note6)); // should return "bird"

        String note7 = "dadaa";
        System.out.println(find(words, note7)); // should return "dada"
    }
}

