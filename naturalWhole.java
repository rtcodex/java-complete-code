//program to print given number is whole/Natural Number
//program 7
import java.util.*;

public class naturalWhole{
    public static void main(String[] args){
        int num;
        System.out.print("Enter Number: ");
        Scanner sc =new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        if(num==0){
            System.out.println("Whole Number");
        }
        else{
            System.out.println("Natural Number");
        }
    }
}