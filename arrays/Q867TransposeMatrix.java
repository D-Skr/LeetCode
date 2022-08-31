package arrays;

import java.util.Arrays;

public class Q867TransposeMatrix {
	// Given a 2D integer array matrix, return the transpose of matrix.
	
    public static int[][] transpose(int[][] matrix) {
        //O(n^2) solution
        //create result array with swapped dimensions
        int[][] result = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                //swap number of row and column
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = {{1,2},{4,5},{7,8}};
		int[][] arr3 = {{1,2,3},{4,5,6}};
		
		System.out.println(Arrays.deepToString(transpose(arr1)));
		System.out.println(Arrays.deepToString(transpose(arr2)));
		System.out.println(Arrays.deepToString(transpose(arr3)));
	}

}
