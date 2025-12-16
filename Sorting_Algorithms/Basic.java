package Sorting_Algorithms;

// Check if array is sorted or not.
public class Basic {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted == true) {
            System.out.println("sorted");
        } else {
            System.out.println("Not sorted");
        }
    }
}
