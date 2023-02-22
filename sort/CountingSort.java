package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountingSort {
    
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        if (arr == null || arr.isEmpty()) {
            return arr;
        }
            int maxValue = Collections.max(arr);
            Integer[] count = new Integer[maxValue+1];
            Integer[] out = new Integer[maxValue+1];
            List<Integer> result = new ArrayList<>(arr.size());
            Collections.fill(result,0);
            for(int i : arr){
                count[i]++;
                //result.set(i+1, result.get(i)+1);
                
                //System.out.println(countArr[i]);
                // System.out.print(result.get(i) + " ");
                // result.set(i, result.get(i)+1);
                // System.out.println(result.get(i));
            }
            System.out.println(Arrays.deepToString(count));
            for(int i = 1; i < count.length; i++) {
                count[i] += count[i - 1];
            }
            
            for(int i = 1; i <= count.length; i++) {
                //result.set(count[arr.get(i)] - 1, i);
                out[count[arr.get(i)] -1] = arr.get(i);
                count[arr.get(i)]--;
            }
            
            result = Arrays.asList(out);
            return result;
        }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,3,2,1);
        System.out.println(countingSort(list));
    }

}
