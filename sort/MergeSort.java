package sort;

import java.util.Arrays;

public class MergeSort {
	// Merge sort of 2 sorted arrays
	public static int[] mergeSort(int[] arr1, int[] arr2) {
		// result array has length as a sum of arr1 and arr2 length
		int[] result = new int[arr1.length + arr2.length];
		
		// index i for arr1, j for arr2
		int i = 0;
		int j = 0;
		for (int k = 0; k < result.length; k++) {
			//if first array is empty
			if( i > arr1.length - 1) {
				result[k] = arr2[j];
				j++;
			} else if(j > arr2.length) { //if second array is empty
				result[k] = arr1[i];
				i++;
			} else if(arr1[i] < arr2[j]) { //compare 2 elements
				result[k] = arr1[i]; //min element added to result array
				i++;
			} else {
				result[k] = arr2[j];
				j++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		 int[] arr1 = new int[] {2, 3, 24, 40, 75, 2300, 2400, 2500};
		 int[] arr2 = new int[] {10, 11, 45, 50, 3000, 5000};

		 System.out.println(Arrays.toString(mergeSort(arr1, arr2)));
		 //[2, 3, 10, 11, 24, 40, 45, 50, 75, 2300, 2400, 2500, 3000, 5000]
	}

}
