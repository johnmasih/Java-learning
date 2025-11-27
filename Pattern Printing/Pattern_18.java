/*

    * * * *
      * * *
        * *
          *

n = 4
 */
package pattern_printing;

import java.util.Scanner;

public class Pattern_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            // For spaces
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            //For Stars
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        sc.close();

    }
}
