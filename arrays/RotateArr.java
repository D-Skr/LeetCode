package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArr {
	// create an algorithm that rotates 
	// the array's content to the right 
	// should be in-place
	// Input: {1,2,3,4,5,6}
	// Output: {2,3,4,5,6,1}
	
	public static void rotateArrayLeft(int[] arr) {
		// store the first element in the temp var
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++)
			arr[i] = arr[i+1];
		arr[arr.length - 1] = temp;
	}

	public static void rotateArrayRight(int[] arr) {
		// store the last element in the temp var
		int temp = arr[arr.length-1];
		for (int i = arr.length -1; i > 0; i--)
			arr[i] = arr[i-1];
		arr[0] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		rotateArrayLeft(arr);
		System.out.println(Arrays.toString(arr));

		rotateArrayRight(arr); //return back
		System.out.println(Arrays.toString(arr));
		
		rotateArrayRight(arr); 
		System.out.println(Arrays.toString(arr));

	}

}
