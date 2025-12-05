// Basic Linear Search With Index
package Arrays;

public class SearchElementInArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 35, 41, 9, 12, 9};
        int target = 9;

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }

        }

        if (index != -1) {
            System.out.println("Element Found At Index : " + index);
        } else {
            System.out.println("Element not found");
        }

    }
}
