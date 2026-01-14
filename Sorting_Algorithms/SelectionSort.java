
package Sorting_Algorithms;

public class SelectionSort {
    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int[] arr = {21,12,5,31,5,41,2,7,8};
        int size = arr.length;

        print(arr);
        
        for(int i = 0 ;i<size-1;i++){
            int minIndex = i;   //assume the minimum element is at position i at the start of each pass.
            
            //this loop is for finding the actual minimum element in the remaining unsorted array
            for(int j = i+1; j<size;j++){
                
                // this is for checking and updating the index of the minimum element.
                if(arr[j]<arr[minIndex]){
                minIndex = j;
                }
                
            }
            // Swap the found minimum element with the first element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        
        print(arr);
       
    }
}
