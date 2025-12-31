//Print 1 1 1 1
//      2 2 2 2
//      3 3 3 3
//      4 4 4 4
// n=4

package pattern_printing;
import java.util.Scanner;

public class Pattern_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }

    }
}
