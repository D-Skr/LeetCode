package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

public class SubarrayDivision1 {
    
    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        int i = 0;
        while(m <= s.size()) {
            int sum = 0;
            List<Integer> temp = s.subList(i, m);
            sum = temp.stream().collect(Collectors.summingInt(Integer::intValue));
            if(sum == d) result++;
            i++;
            m++;
        }
        return result;
    }

    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(2,2,1,3,2);
        System.out.println(birthday(list, 4, 2));
    }

}
