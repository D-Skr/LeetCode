package arrays;

import java.util.Arrays;

public class Q905 {
	
	//905. Sort Array By Parity
	public static int[] sortArrayByParity(int[] nums) {
		int[] arr = new int[nums.length];
		int start = 0;
		int end = nums.length - 1;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0)
				arr[start++] = nums[i];
			else arr[end--] = nums[i];
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr1 = {2,3,1,4};
		int[] arr2 = {1,3,5,6};
		System.out.println(Arrays.toString(sortArrayByParity(arr1))); // [2, 4, 1, 3]
		System.out.println(Arrays.toString(sortArrayByParity(arr2))); // [6, 5, 3, 1]
	}

}
