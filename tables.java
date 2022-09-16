//print mathematical tables by user input
//program 6
import java.util.*;


public class tables {
    public static void main(String[] args)
    {
        int num,i;
        System.out.println("Enter num for which Table to be printed: ");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        sc.close();
        for(i=1;i<=10;i++){
        System.out.println(num+"*"+ i+"="+(num*i));
        }
       
        
    }
}
