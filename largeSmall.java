//program 22
public class largeSmall {
    public static void main(String[] args){
      int a[]={1,5,6,7,0};
     
      //intialize 
      int smallest = a[0];
      int largest = a[0];

      //logic for checking largest & smallest element 
      for(int i=1 ; i<a.length; i++){
        if(a[i]>largest){
          largest = a[i];
        }
        else if  (a[i]<smallest){
          smallest = a[i];
        }
      }

      //printing largest & smallest number from the array
      System.out.println("Largest Number is: "+largest);
      System.out.println("Smallest Number is: "+smallest);
        
        }

    }
    

