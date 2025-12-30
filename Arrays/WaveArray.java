
package Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        int size = arr.length;
        int i = 0;
        int j = 1;
        
        while(j<size){
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j]=temp;
            i+=2;
            j+=2;
        }
        
        for(int ele :arr){
            System.out.print(ele + " ");
        }
    }
}
