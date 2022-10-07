//program 17

import java.util.*;
public class guessgame {
    public static void main(String[] args) 
	{
	    int mynum = ((int)(Math.random()*100));
	    int userno=0;
	    Scanner sc= new Scanner(System.in);
	    do{
	        System.out.println("Guess the number: ( To exit the game -1)");
	         userno = sc.nextInt();
	        if(userno==mynum)
	        {
	            System.out.println("CONGRATS!!! YOU GUESSED IT RIGHT!!!");
	            
	        }
	        else if(userno>mynum)
	        {
	            System.out.println("Your no is greater!");
	        }
	        else if(userno<mynum){
	            System.out.println("Your no is smaller!");
	            
	        }
	            
	        else{
	            System.out.println("try again!");
	        }
	        
	       }while(userno>=0);  //till user number is greater in than 0 if its less than loop terminates.
	       
	        System.out.println("my no was : " + mynum);
	        
	       sc.close();  
	     }

		 
	        

}
