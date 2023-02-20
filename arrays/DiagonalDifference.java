package arrays;

import java.util.Arrays;
import java.util.List;
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

public class DiagonalDifference {
    
    static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(arr.size() - 1 - i);
        }
        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1,2,3)
                ,Arrays.asList(4,5,6)
                ,Arrays.asList(77,8,9));
        
        System.out.println(diagonalDifference(arr)); //70

    }

}
