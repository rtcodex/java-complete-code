//program 20

public class trycatch {
    public static void main(String[] args) {  
        // try  
        // {  
        // int data=50/0; //may throw exception   
        // }  
        //     //handling the exception  
        // catch(ArithmeticException e)  
        // {  
        //     System.out.println(e);  
        // }  
        // System.out.println("rest of the code");  --code is generating yellow warning in the code in editor

        System.out.println("-----------------------------");
        try  
        {  
        int arr[]= {1,3,5,7};  
        System.out.println(arr[10]); //may throw exception   
        }  
            // handling the array exception  
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
        System.out.println("-----------------------------");
    }  
}
