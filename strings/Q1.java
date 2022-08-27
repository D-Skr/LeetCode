package strings;

import java.util.Arrays;
import java.util.HashMap;

public class Q1 {
	
	//1.Two Sum
    public static int[] twoSum(int[] nums, int target) {
        //v.1 O(n^2)
//         int i, j;
//         int[] sum = new int[2];
        
//         for (i = 0; i < nums.length; i++){
//             for (j = i+1; j < nums.length; j++){
//                 if((nums[i] + nums[j]) == target){
//                     sum[0] = i;
//                     sum[1] = j;
//                     break;
//                 }
//             }
//         }
//         return sum;
        
        //v.2 O(n)
        HashMap<Integer,Integer> map = new HashMap<>();  // val : index
        for (int i = 0; i < nums.length; i ++){
            if(map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
            else map.put(nums[i],i);
        }
        return null;
    }
    
    public static void main(String[] args) {
    	int[] arr1 = {9,1,3,5,2,8};
    	int[] arr2 = {};
    	
    	System.out.println(Arrays.toString(twoSum(arr1,5))); //[2,4]
    	System.out.println(Arrays.toString(twoSum(arr2,3))); //null
    	System.out.println(Arrays.toString(twoSum(arr1,10))); //[0,1]
    }
}
