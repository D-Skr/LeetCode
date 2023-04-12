package arrays;

public class MissingNumber {
    //find the missing number in an integer array of 1 to 10
    
    public static void missingNumber(int[] intArray) {
        for(int i = 0; i < intArray.length - 1; i++) {
            if(intArray[i] + 1 != intArray[i +1]) {
                System.out.print(intArray[i] + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,8,9,10};
        missingNumber(intArray); //7
    }

}
