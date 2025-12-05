
package Arrays;
import java.util.Arrays;
public class DeepCopyOfArray {
    public static void main(String[] args) {
        // deep copy using Arrays.copyOf().
        
        int[] arr1 = {10,21,31,41};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        
        arr2[0] = 100;
        print(arr2);
        
        print(arr1);
        
  
//        int[] arr2 = new int[arr1.length];
        
        // Creating Deep Copy Manually Using Loop
//        for(int i=0;i<arr1.length;i++){
//            arr2[i] = arr1[i];
//        }
//        
//        for(int i : arr2){
//            System.out.print(i+" ");
//        }
//        System.out.println("");
//        
//        arr2[0] = 44;   //change in arr2 , will not affect the arr1.  
//        
//        
//        System.out.println("array 1");
//        for(int i : arr1){
//            System.out.print(i+" ");
//        }
//        System.out.println("");
//        
//        
//        System.out.println("array 2");
//        for(int i : arr2){
//            System.out.print(i+" ");
//        }
    }
    public static void print(int []x){
        for(int i = 0; i<x.length; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println("");
    }
}
