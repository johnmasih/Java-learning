
package Sorting_Algorithms;

public class BubbleSort {
    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int[] arr = {-1,-8,3,4,8,31,-3,6,7,9};
       int size = arr.length;
       boolean isSorted;
       print(arr);
       
       for(int i=0;i<size-1;i++){
           isSorted = true;
//           int swaps =0;
           
           for(int j=0;j<size-1-i;j++){
               if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   isSorted = false;
//                     swaps++;
               }
           }
           
           if(isSorted) break;
//           if(swaps==0) break;
       }
       
       print(arr);

    }
}
