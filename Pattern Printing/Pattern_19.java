/*
Pyramid
          *
        * * *
      * * * * *
    * * * * * * *

n = 4
 */
package pattern_printing;

import java.util.Scanner;

public class Pattern_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

//      Method 1
//        for (int i = 1; i <= n; i++) {
//            // For spaces
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print("  ");
//            }
//            //For Stars
//            for (int j = 1; j <= 2*i-1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }


//       Method 2
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

        sc.close();

    }
}
