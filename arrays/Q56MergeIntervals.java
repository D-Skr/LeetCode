package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q56MergeIntervals {
	
	//Given an array of intervals where 
	//intervals[i] = [starti, endi], merge all 
	//overlapping intervals, and return an array of 
	//the non-overlapping intervals that cover all the intervals in the input.
		public static int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (i1,i2) -> i1[0] - i2[0]);
        int[] firstInterval = intervals[0];
        result.add(firstInterval);
        for (int[] interval : intervals){
            if(interval[0] <= firstInterval[1]){
                firstInterval[1] = Math.max(firstInterval[1], interval[1]);
            } else {
                firstInterval = interval;
                result.add(firstInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
	public static void main(String[] args) {
		int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
		int[][] intervals2 = {{1,15},{2,6},{8,10},{15,55}};
		
		System.out.println(Arrays.deepToString(merge(intervals1)));
		System.out.println(Arrays.deepToString(merge(intervals2)));
	}

}
