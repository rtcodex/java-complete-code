//program to check whether given numbe  is prime or not
//program 9

import java.util.*;
public class primeNonprime {
    public static void main(String[] args){
        int num,m=0,flag=0,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        num = sc.nextInt();
        sc.close();
       //Main logic
        m=num/2;
        if(num==0||num==1){  
            System.out.println(num+" is not prime number");      
           }else{  
            for(i=2;i<=m;i++){      
             if(num%i==0){      
              System.out.println(num+" is not prime number");      
              flag=1;      
              break;      
             }      
            }      
            if(flag==0)  { System.out.println(num+" is prime number"); }  
           }//end of else  
        
          
    }
}
