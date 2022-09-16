// program to calculate 
//program 4
import java.util.*;
public class factorial {
public static void main(String[] args){
    int num, fact=1;
    System.out.println("Enter Factorial Number: ");
    Scanner sc= new Scanner(System.in);
    num = sc.nextInt();
    for(int i = 1; i<=num; i++){
        fact=fact*i;
    }
    System.out.print("Factorial is: "+ fact);
sc.close();

}    
}
