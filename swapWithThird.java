//program to swap 2 numbers with 3rd variable
//program 11
import java.util.*;
public class swapWithThird {
    public static void main(String[] args){
        int  num1, num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num1 & Num2 : ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        sc.close();

         //logic to swap without 3rd variable. 
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After Swap: "+num1+" "+num2);

    }
}
