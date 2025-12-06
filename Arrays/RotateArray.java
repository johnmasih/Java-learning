// Rotate Array by N Elements
package Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 21, 3, 7, 14, 6, 2};
        int n = 9;
        int size = arr.length;

        n %= size;
        
        System.out.println("Before Rotating : ");
        print(arr);

        reverse(arr, 0, n - 1);
//        print(arr);
        reverse(arr, n, size - 1);
//        print(arr);
        reverse(arr, 0, size - 1);
        
        System.out.println("After Rotating : ");
        print(arr);
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
