//Print A A A A
//      B B B B
//      C C C C
//      D D D D
// n=4
package pattern_printing;

import java.util.Scanner;

public class Pattern_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i + 64));
            }
            System.out.println("");
        }
    }
}
