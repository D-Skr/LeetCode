package arrays;

import java.util.Arrays;

public class Q832FlippingImage {
	//832. Flipping an Image 
    public static int[][] flipAndInvertImage(int[][] image) {
        //create another result array 
        int[][] result = new int[image.length][image[0].length];
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image.length; j++){
                //moving from the end of each row to beginning
                if(image[i][image.length -1 -j] == 0){
                    //assign inverted value
                    result[i][j] = 1;
                } else result[i][j] = 0;
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		int[][] arr = {{0,1,1},{1,1,0},{0,0,0}};
		
		System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));

	}

}
