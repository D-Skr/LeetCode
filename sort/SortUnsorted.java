package sort;

import java.util.Arrays;

public class SortUnsorted {
	// sort unsorted with Merge sort
	public static void sort(int[] array, int low, int high) {
		if(high <= low) return;
		int mid = low + (high - low)/2;
		//devide in small arrays
		sort(array, low, mid);
		sort(array, mid + 1, high);
		
		int[] temp = Arrays.copyOf(array, array.length);
		
		for (int k = low; k <= high; k++) {
			temp[k] = array[k];
		}
		
		int i = low; 
		int j = mid + 1;
		for (int k = low; k <= high; k++) {
			if(i > mid) {
				array[k] = temp[j];
				j++;
			} else if(j > high) {
				array[k] = temp[i];
				i++;
			} else if(temp[j] < temp[i]) {
				array[k] = temp[j];
				j++;
			} else {
				array[k] = temp[i];
				i++;
			}
		}
		
	}
	public static void main(String[] args) {
		int[] arr1 = new int[] {75, 2, 300, 2, 3, 24, -40, 2, 400, 2500, -100, 10};
		int[] arr2 = new int[] {50, 3000, 1, 0, -11, 45, 5000, -2};
		
		sort(arr1,0, 11);
		sort(arr2,0, 7);
		
		//[-100, -40, 2, 2, 2, 3, 10, 24, 75, 300, 400, 2500]
		System.out.println(Arrays.toString(arr1));
		
		//[-11, -2, 0, 1, 45, 50, 3000, 5000]
		System.out.println(Arrays.toString(arr2));
	}

}
