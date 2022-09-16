//program 13
import java.util.*;
public class palindrome {
    public static void main(String[] args){
        int n,temp=0, rem, sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:  ");
        n=sc.nextInt();
        sc.close();
        temp=n;
        while(n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
    


}
