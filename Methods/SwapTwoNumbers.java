/*   Demonstrating pass-by-value concept   */

package Methods;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After " + x + " " + y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before " + a + " " + b);
        swap(a, b);
    }
}
