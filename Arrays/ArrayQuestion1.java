// Q. - Multiple odd indexed elements by 2 and add 10 to even indexed elements
package Arrays;

public class ArrayQuestion1 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 4, 8, 5};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] *= 2;
            } else {
                arr[i] += 10;
            }
        }
        print(arr);
    }

    public static void print(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("");
    }
}
