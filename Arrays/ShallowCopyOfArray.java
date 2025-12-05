
package Arrays;

public class ShallowCopyOfArray {
    public static void main(String[] args) {
        int[] arr1 = {12,24,36,48};
        int[] arr2 = arr1; //Shallow Copy (Only the reference of arr1 is copied not all elements of arr1)\
        
        arr2[1] = 8;
        
        System.out.println(arr1[1]);   // Output - 8
        // changing one array will affect the other one because it is Shallow Copy not deep copy
    }
}
