/*
Diamond
          *
        * * *
      * * * * *
    * * * * * * *
      * * * * *
        * * *
          *

n = 4 <-
 */
package pattern_printing;

import java.util.Scanner;

public class Pattern_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int sp = n-1, st = 1;
        for (int i = 1; i <= n; i++) {
            // For spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            //For Stars
            for (int j = 1; j <= st; j++) {
                System.out.print("* ");
            }
            
            sp--;
            st += 2;
            System.out.println("");
        }
        
        
        sp = 1;
        st = 2*n-3;
        for (int i = 1; i <= n; i++) {
            // For spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            //For Stars
            for (int j = 1; j <= st; j++) {
                System.out.print("* ");
            }
            
            sp++;
            st -= 2;
            System.out.println("");
        }

        sc.close();

    }
}
