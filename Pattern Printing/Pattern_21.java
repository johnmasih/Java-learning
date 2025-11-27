/*
Bridge

        * * * * * * * * * 
        * * * *   * * * *
        * * *       * * *
        * *           * *
        *               *

n = 5 <-
 */

package pattern_printing;

import java.util.Scanner;

public class Pattern_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int sp =1;
        
        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print("* ");
        }
        System.out.println("");
        
        for (int i = 1; i <= n-1; i++) {
            //For Stars
            for (int j = 1; j <= n-i; j++) {
                System.out.print("* ");
            }
            
            // For spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            //For Stars
            for (int j = 1; j <= n-i; j++) {
                System.out.print("* ");
            }
            
            
            sp += 2;
            System.out.println("");
        }

        sc.close();

    }
}
