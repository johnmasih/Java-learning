package Arrays;

import java.util.Scanner;

public class InputOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];  // Declaration + Memory Allocation
        
        // Taking Input
        System.out.println("enter array's elements ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        //Printing Array
        System.out.println("your array :- ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}
