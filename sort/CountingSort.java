package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountingSort {
    
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
            int maxValue = Collections.max(arr);
            Integer[] count = new Integer[maxValue+1];
            List<Integer> result = new ArrayList<>();
            //Collections.fill(result,0);
            for(int i : arr){
                count[i]++;
                //System.out.println(countArr[i]);
                // System.out.print(result.get(i) + " ");
                // result.set(i, result.get(i)+1);
                // System.out.println(result.get(i));
            }
            //System.out.println(Arrays.deepToString(count));
            result = Arrays.asList(count);
            return result;
        }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
