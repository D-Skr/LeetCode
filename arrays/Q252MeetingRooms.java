package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Q252MeetingRooms {
    public static boolean canAttendMeetings(int[][] intervals) {
        if(intervals == null || intervals.length == 0) return true;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0]-b[0];
            }
        });
        
        int[] prev = intervals[0];
        for(int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            if (prev[1] > curr[0]) return false;
            prev = curr;
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[][] intervals1 = {{5,10},{1,4},{3,7}};  //false
        int[][] intervals2 = {{1,2},{3,4},{0,1}};   //true
        System.out.println(canAttendMeetings(intervals1));
        System.out.println(canAttendMeetings(intervals2));
    }
}
