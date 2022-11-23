import java.util.Arrays;

public class TestAmEx {

//    Given an array of integers (Whole numbers), segregate even and odd numbers by 
//    moving all even numbers to the right hand side and all odd to the left hand side of the array.
//    Input: 4. 5, 5, 8, 9, 1, 0, 0, 2, 4, 6
//    Output: 5, 5, 9, 1, 4, 8, 0, 0, 2, 4, 6
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int[] arr1 = {4, 5, 5, 8, 9, 1, 0, 0, 2, 4, 6};
        int[] arr2 = new int[arr1.length];
        int j = 0;
        int k = arr1.length -1;
        
        for (int i = 0; i < arr1.length; i++) {
            if(arr1.length == 0 || arr1.length == 1) {
                arr2 = arr1;
            }
            if(arr1[i] % 2 == 0) {
                arr2[k] = arr1[i];
                //System.out.println(k + " " + arr2[k]);
                k--;
            } else {
                arr2[j] = arr1[i];
                //System.out.println(j + " " + arr2[j]);
                j++;
            }
        }
            System.out.println(Arrays.toString(arr2));
      }

}
