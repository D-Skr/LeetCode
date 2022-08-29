package arrays;

import java.util.Arrays;

public class RevertArray {

	public static int[] reverse(int[] arr) {
		int[] result = new int[arr.length];
		
		for(int i=0; i < arr.length; i++) {
			result[i] = arr[arr.length -1 -i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {0,2,3,4,5,6,1,1};
		
		Arrays.stream(reverse(arr))
			.forEach(System.out::println);

	}

}
