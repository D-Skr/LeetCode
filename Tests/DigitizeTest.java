package Tests;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigitizeTest {
    
    /*
     * 0. Enter string
     * 1. Read input
     * 2. Create linked list dictionary (hashmap) (global memory)
     * 3. no strtok().
     * 4. for each word: store the lenght of word and the first 4 letters.
     * 
     * 5. sort list alphabetically by reassigning pointer links
     * 6. search and return the entry
     * 7. support adding entries to the current linked list. Sort
     * 8. support initializing/deleting the current list
     * 9. case sensitive and insensitive search modes
     * 10. write guide how to run. Add example
     */
    
            
    static List<Word> sortList(List<Word> list) {
        Collections.sort(list, (word1,word2) -> word1.getValue().compareTo(word2.getValue()));
        return list;
    }
    
    static String searchCaseSens(String s, List<Word> list) {
        String result = "No matches";
        for(Word w : list) {
            if(w.getFirstFourLetters().equals(s)) result = w.getValue();
        }
        return "Search result: " + result;
    }
    
    static String searchCaseInsens(String s, List<Word> list) {
        String result = "No matches";
        for(Word w : list) {
            if(w.getFirstFourLetters().equalsIgnoreCase(s)) result = w.getValue();
        }
        return "Search result: " + result;
    }
    
    static List<Word> addWords(List<Word> list) throws IOException{
        BufferedReader reader = new BufferedReader(new
        InputStreamReader(System.in));
        System.out.println("Please enter your sentence and press <ENTER>: ");
        String input = reader.readLine();
        System.out.println("Your input is:" + input);
        String[] arr = input.split(" ");
        for(String s : arr) {
            Word w = new Word(s);
            list.add(w); 
        }
        sortList(list);
        return list;
    }
    
    static void printList(List<Word> list) {
        System.out.println("Your sorted list: ");
        for(Word w : list) {
            System.out.println("word = " + w.getValue() + 
                    ", lenght = " + w.getLenght() + 
                    ", first 4 letters = " + w.getFirstFourLetters());
        }
    }
    

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new
        InputStreamReader(System.in));
        System.out.println("Please enter your sentence and press <ENTER>: ");
        String input = reader.readLine();
        System.out.println("Your input is:" + input);
        
        String[] arr = input.split(" ");
        List<Word> list = new ArrayList<>();
        for(String s : arr) {
            Word w = new Word(s);
            list.add(w); 
        }
        
        sortList(list);
        
        boolean isContinue = true;
        
        while (isContinue) {
            System.out.println("\nPlease choose your option:");
            System.out.println("1. Print your list");
            System.out.println("2. Case sensitive word search");
            System.out.println("3. Case insensitive word search");
            System.out.println("4. Erase the list");
            System.out.println("5. Add words");
            System.out.println("6. Exit");
            
            String option = reader.readLine();
            switch (option) {
                case ("1"):
                    System.out.println("Console output");
                    printList(list);
                    break;
        
                case ("2"):
                    System.out.println("Case sensitive word search option selected");
                    System.out.println("Enter your word: ");
                    input = reader.readLine();
                    System.out.println(searchCaseSens(input, list));
                    break;
        
                case ("3"):
                    System.out.println("Case insensitive word search option selected");
                    System.out.println("Enter your word: ");
                    input = reader.readLine();
                    System.out.println(searchCaseInsens(input, list));
                    break;
        
                case ("4"):
                    list = new ArrayList<>();
                    System.out.println("List erased");
                    break;
        
                case ("5"):
                    System.out.println("Enter your words to add in the list: ");
                    addWords(list);
                    break;
                
                case ("6"):
                    System.out.println("See you!");
                    isContinue = false;
                    return;
        
                default:
                    System.out.println("Invalid option, please enter number 1 - 6 only");
                    break;
                }
    }

}
}
class Word {

    private String value;
    private int lenght;
    private String firstFourLetters;
    
    public Word(){}
    
    public Word(String s) {
        value = s;
        if(!s.isEmpty()) lenght = s.length();
        if(lenght > 3) {
            firstFourLetters = s.substring(0,4);
        } else {
            firstFourLetters = s;
        }
    }
    

    
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public int getLenght() {
        return lenght;
    }
    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
    public String getFirstFourLetters() {
        return firstFourLetters;
    }
    public void setFirstFourLetters(String firstFourLetters) {
        this.firstFourLetters = firstFourLetters;
    }
    
    @Override
    public String toString() {
        return "word = " + value + ", lenght = " + lenght + ", first 4 letters = " + firstFourLetters + "\n";
    }
    
}
           
