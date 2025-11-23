import java.util.Scanner;


public class Ifelsestatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        // for If else statement
//        System.out.println("Enter a number  : ");
//        int num = sc.nextInt();
//        
//        if(num %2 ==0){
//            System.out.println("even number ");
//        }else{
//            System.out.println("odd number  ");
//        }
        
        // for If else if Statement
        System.out.println("enter your age : ");
        int age = sc.nextInt();
        
        if(age <=12){
            System.out.println("you are a child ");
        }else if (age > 12 && age< 18){
            System.out.println("you are a teenager ");
        } else{
            System.out.println("you are an adult");
        }
    }
    
}
