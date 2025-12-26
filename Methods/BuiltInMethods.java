
package Methods;

public class BuiltInMethods {
    public static void main(String[] args) {
        double x = Math.sqrt(16);    // For Square root
        double y = Math.cbrt(343);   // For Cube root
        System.out.println(x);
        System.out.println(y);
        System.out.println(Math.abs(-8.8));  // Math.abs() gives the absolute(non-negative) values.
        System.out.println(Math.floor(8.3));  // Math.floor(x) returns the greatest integer less than or equal to x
        System.out.println(Math.floor(-3.3)); 
        System.out.println(Math.ceil(8.00001));  // opp. of floor()
        System.out.println(Math.ceil(-8.01)); 
        
        System.out.println(Math.max(3, 9)); // returns the max of two no.
        System.out.println(Math.max(-3, 2)); 
        System.out.println(Math.min(3, -9)); // returns the min of two no.
        
        System.out.println(Math.pow(8, 2)); 
        
        System.out.println(Math.max(Math.max(7, 9), Math.max(8,3)));   // to find max of 4 numbers
                                            // 9           // 8
                           //(9)
                           
        
    }
}
