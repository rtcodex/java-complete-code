//program to print fibonnaci series
// print for number 5 is 0 1 1 2 3 5
//program 5

import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args)
    {
        int num, f1=0, f2=1, f3;
        System.out.println("Enter the number to print fibonnaci series : ");
        Scanner sc= new Scanner(System.in);
        num = sc.nextInt();
        System.out.print("Fiboonaci Series: " +f1+" "+f2);
        for(int i =2; i<= num; i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.print(" "+f3);
        }

        sc.close();
    }
}
