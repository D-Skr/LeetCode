package arrays;

import java.util.List;

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
        if(m ==1) {
            for(Integer i : s){
                if(i == d) result++;
            }
        }
        if (s.size()< m) return 0;
        if(m > 1) {
            for(int i = 0; i < s.size()-m; i++){
                int sum = s.get(i);
                while(m > 1){
                    sum += s.get(i+m-1);
                    m--;
                }
                if(sum == d) result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
