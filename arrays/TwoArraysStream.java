package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class TwoArraysStream {
	//given 2 arrays, merge only even elements from both to one array.
	
	// v.1 solution with loops
	public static int[] findEvenNums1(int[] arr1, int[] arr2) {
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int num : arr1) {
			if(num % 2 == 0) result.add(num);
		}

		for(int num : arr2) {
			if(num % 2 == 0) result.add(num);
		}
		//converting result stream into array
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
	
	//v.2 solution by using Stream API
	public static int[] findEvenNums2(int[] arr1, int[] arr2) {
		IntPredicate isEvenPred = num -> num % 2 == 0;
		return Stream.of(arr1, arr2)
				.flatMapToInt(Arrays::stream)
				.filter(isEvenPred)
				.toArray();
	}

	public static void main(String[] args) {
		int[] arr1 = {-7,3,1,2,8,-5,-8,16,99,-100};
		int[] arr2 = {1,3,2,2,3,4,-5,-6,7,100};
		
		Arrays.stream(findEvenNums1(arr1, arr2))
			.forEach(System.out::println);
		
		System.out.println("~~~~~~~~~~~~");
		
		Arrays.stream(findEvenNums2(arr1, arr2))
			.forEach(System.out::println);
	}

}
