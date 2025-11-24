/*
        *
        *
    * * * * *
        *
        *

n = 5
 */
package pattern_printing;

import java.util.Scanner;

public class Pattern_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any odd number");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Enter odd number not even number");
        } else {
            int mid = (n / 2) + 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == mid || j == mid) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
