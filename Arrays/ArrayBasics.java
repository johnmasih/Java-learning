
package Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        // Array's Length
        System.out.println(arr.length);   // Output = 5
        
       // Printing all elements of Array
       // Using for loop
       
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
