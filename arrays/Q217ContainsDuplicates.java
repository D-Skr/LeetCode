package arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Q217ContainsDuplicates {
    /*https://leetcode.com/problems/contains-duplicate/submissions/896894890/
    *Given an integer array nums, 
    *return true if any value appears at least twice in the array, 
    *and return false if every element is distinct.
    *Example
    *Input: nums = [1,2,3,1]
    *Output: true
    */
    
        public static boolean containDuplicates(int[] arr) {
            boolean isDups = true;
            Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
            
            //set contains only unique element. 
            //Compare sizes: if array does not contain dups sizes should be equal
            if(set.size() < arr.length) isDups = true;
            return isDups;
        }
        
    public static void main(String[] args) {
       

    }

}
