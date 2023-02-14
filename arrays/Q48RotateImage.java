package arrays;

import java.util.Arrays;

/*
 * You are given an n x n 2D matrix representing an image, 
 * rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place, 
 * which means you have to modify the input 2D matrix directly. 
 * DO NOT allocate another 2D matrix and do the rotation.
 * 
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 */

public class Q48RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int layer = 0; layer < n/2; layer++){
            int first = layer;
            int last = n-1-layer;
            for(int i = first; i < last; i++){
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }    
        }                    
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(matrix));  //[[1,2,3],[4,5,6],[7,8,9]]
        
        //rotate
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));  //[[7,4,1],[8,5,2],[9,6,3]]
    }

}
