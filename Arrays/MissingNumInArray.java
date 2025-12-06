
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
