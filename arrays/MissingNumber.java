package arrays;

public class MissingNumber {
    //find the missing number in an integer array of 1 to 10
    
    public void missingNumber(int[] intArray) {
        for(int i = 0; i < intArray.length - 1; i++) {
            if(intArray[i] + 1 != intArray[i +1]) {
                System.out.print(intArray[i] + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        
    }

}