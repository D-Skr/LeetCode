package arrays;

import java.util.Arrays;

public class RevertArray {

	//v.1 solution with loop and new array
	public static int[] reverse(int[] arr) {
		int[] result = new int[arr.length];
		
		for(int i=0; i < arr.length; i++) {
			result[i] = arr[arr.length -1 -i];
		}
		return result;
	}
	
	//v.2 in-place solution
	public static void reverseInPlace(int[] arr) {
		for(int i = 0; i < arr.length / 2; i++) {
			//swap item at index i and item at index (arr.length -1 -i)
			int temp = arr[i];
			arr[i] = arr[arr.length -1 -i];
			arr[arr.length -1 -i] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {0,2,3,4,5,6,1,1};
		int[] arr2 = {0,2,3,4,5,6,1,1};
		
		Arrays.stream(reverse(arr1))
			.forEach(System.out::println);
		
		System.out.println("~~~~~~~~~");
		reverseInPlace(arr2);
		Arrays.stream(arr2)
		.forEach(System.out::println);
		
		System.out.println("~~~~~~~~~");
		//return back reversed array
		reverseInPlace(arr2);
		Arrays.stream(arr2)
		.forEach(System.out::println);
	}

}
