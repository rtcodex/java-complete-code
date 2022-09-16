// program to print given number is even or odd
//program 8
import java.util.*;
public class evenOdd {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        num = sc.nextInt();
        if(num%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }

        sc.close();

    }
}
