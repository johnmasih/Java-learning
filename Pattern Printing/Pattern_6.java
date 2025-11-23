//Print a a a a
//      B B B B
//      c c c c
//      D D D D
// n=4
//ASCII VALUE OF A=65 AND a=97

package pattern_printing;

import java.util.Scanner;

public class Pattern_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) (i + 64));
                } else {
                    System.out.print((char) (i + 96));
                }
            }
            System.out.println("");
        }
    }
}
