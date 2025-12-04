package Arrays;

import java.util.Scanner;

public class LargestNumberInArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int size = sc.nextInt();
        
        int [] arr = new int[size];
        
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("");
        
        //int max = arr[0];
        int max = Integer.MIN_VALUE;  // good practice
        for (int i = 0; i < size; i++) {
            if(arr[i]>max) max = arr[i];
        }
        System.out.println("The Largest Element of the array is : " + max);
        
        sc.close();

    }
}
