
package Arrays;

public class ProductOfAllElements {
    public static void main(String[] args) {
        int[] arr = {10,10,2,3};
        int product = 1;
        
        for(int i=0;i<arr.length;i++){
            product *= arr[i];
        }
        
        System.out.println("Product Of All Elements Is : " + product);
    }
}
