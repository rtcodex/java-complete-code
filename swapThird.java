//program to swap 2 numbers with third variable
//program 10
import java.util.*;
public class swapThird {
    public static void main(String[] args){
        int  a, b, temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num1 & Num2 : ");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();

        //logic to swap with 3rd variable i.e. temp 
        temp=a;
        a=b;
        b=temp;

        System.out.println("After Swap: "+a+" "+b);

    }
}
