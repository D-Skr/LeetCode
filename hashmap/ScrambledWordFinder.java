package hashmap;

import java.util.HashMap;
import java.util.Map;

/*This solution uses two HashMap to count the frequency of each character
 *  in both the word and the note. Then for each word, it checks if the 
 *  characters in the word are all present in the note, and their 
 *  frequency is less or equal to the note's frequency. 
 *  If this is true for a word, that word is returned as the result. 
 *  If no word is found, it returns '-'. 
 */

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

/*
You are running a classroom and suspect that some of your students are passing around the answer to a multiple-choice question disguised as a random note.

Your task is to write a function that, given a list of words and a note, finds and returns the word in the list that is scrambled inside the note, if any exists. If none exist, it returns the result "-" as a string. There will be at most one matching word. The letters don't need to be in order or next to each other. The letters cannot be reused.

Example:  
words = ["baby", "referee", "cat", "dada", "dog", "bird", "ax", "baz"]
note1 = "ctay"
find(words, note1) => "cat"   (the letters do not have to be in order)  
  
note2 = "bcanihjsrrrferet"
find(words, note2) => "cat"   (the letters do not have to be together)  
  
note3 = "tbaykkjlga"
find(words, note3) => "-"     (the letters cannot be reused)  
  
note4 = "bbbblkkjbaby"
find(words, note4) => "baby"    
  
note5 = "dad"
find(words, note5) => "-"    
  
note6 = "breadmaking"
find(words, note6) => "bird"    

note7 = "dadaa"
find(words, note7) => "dada"    

All Test Cases:
find(words, note1) -> "cat"
find(words, note2) -> "cat"
find(words, note3) -> "-"
find(words, note4) -> "baby"
find(words, note5) -> "-"
find(words, note6) -> "bird"
find(words, note7) -> "dada"

*/
