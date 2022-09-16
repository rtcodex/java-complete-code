//Arthmatic operations User Input 
//program 3
import java.util.*;
public class arthimaticUser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

    System.out.println("Calculations are : ");
    System.out.println(num1+num2);
    System.out.println(num1-num2);
    System.out.println(num1*num2);
    System.out.println(num1/num2);

    sc.close();
        
    }
}
