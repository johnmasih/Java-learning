package Arrays;

public class ReverseOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 35, 84, 9, 16, 4, 7};
        int size = arr.length;

        int i = 0, j = size - 1;
        while(i<j){
            swap(arr, i,j);
            i++;
            j--;
        }
        
        print(arr);
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] =temp;
    }
    
    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
