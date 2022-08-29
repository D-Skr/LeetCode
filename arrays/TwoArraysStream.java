package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoArraysStream {
	//given 2 arrays, merge only even elements from both to one array.
	
	// v.1 solution with loops
	public static int[] findEvenNums(int[] arr1, int[] arr2) {
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int num : arr1) {
			if(num % 2 == 0) result.add(num);
		}

		for(int num : arr2) {
			if(num % 2 == 0) result.add(num);
		}
		
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
	

	public static void main(String[] args) {
		int[] arr1 = {-7,3,1,2,8,-5,-8,16,99,-100};
		int[] arr2 = {1,3,2,2,3,4,-5,-6,7,100};
		
		Arrays.stream(findEvenNums(arr1, arr2))
			.forEach(System.out::println);
	}

}
