/*
    1
    1 3
    1 3 5
    1 3 5 7
    1 3 5 7 9

n = 5
 */
package pattern_printing;

import java.util.Scanner;

public class Pattern_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = 1;                   //<- declare it inside outer loop
            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");
                num += 2;
            }
            System.out.println("");

        }
    sc.close();

    }
}
// key point is --> Variables declared inside the loop reset (re-initialized) every iteration.
