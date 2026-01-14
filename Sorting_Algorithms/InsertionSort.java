
package Sorting_Algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8,4,2,3,9,10,34,12,6};
        for(int i = 1; i<arr.length;i++){   // assuming that 0th element is sorted , so starting from 1. 
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){  
                // if jth element is smaller than its previous one, then swap with it.
                // and move left to find the correct position
                int temp = arr[j];
                arr[j] = arr[j-1];  
                arr[j-1] = temp;
                
                j--;
            }
        }
        
        // printing the Array
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    
}
