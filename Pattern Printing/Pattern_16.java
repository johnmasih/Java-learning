/*

          A
        B B
      C C C
    D D D D

n = 4
 */
package pattern_printing;

import java.util.Scanner;

public class Pattern_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println("");
        }

        sc.close();

    }
}
