/* Q. You are given an array of size n−1 that contains distinct numbers from 1 to n,
      but one number is missing. Find and return the missing number. */
package Arrays;

public class MissingNumInArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5};
        int n = arr.length + 1;

        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        
        for(int i : arr){
            arraySum += i;
        }
        
        System.out.println("The missing Element is : " + (totalSum - arraySum));
    }

}
