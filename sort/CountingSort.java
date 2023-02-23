package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort {
    
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        if (arr == null || arr.isEmpty()) {
            return arr;
        }
            int maxValue = Collections.max(arr);
            int[] count = new int[maxValue + 1];
            for(int i : arr){
                count[i]++;
            }

            
            List<Integer> result = Arrays
                    .stream(count)
                    .boxed()
                    .collect(Collectors.toList());
            return result;
        }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,3,2,1);
        System.out.println(countingSort(list));
    }

}
