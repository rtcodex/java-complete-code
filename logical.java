//program 16
// AND Operator ( && ) – if( a && b ) [if true execute else don’t]
// OR Operator ( || ) – if( a || b) [if one of them is true execute else don’t]
// NOT Operator ( ! ) – !(a<b) [returns false if a is smaller than b]

public class logical {
    public static void main(String[] args)
    {
        // initializing variables
        int a = 10, b = 20, c = 20, d = 0;
  
        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);
  
        // using logical AND to verify
        // two constraints
        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");


            System.out.println("-------------------------------");

            int aa = 10, bb = 1, cc = 10, dd = 30;
  
        // Displaying a, b, c
        System.out.println("Var1 = " + aa);
        System.out.println("Var2 = " + bb);
        System.out.println("Var3 = " + cc);
        System.out.println("Var4 = " + dd);
  
        // using logical OR to verify
        // two constraints
        if (aa > bb || cc == dd)
            System.out.println("One or both + the conditions are true");
        else
            System.out.println("Both the + conditions are false");

            System.out.println("-------------------------------");

            int aaa = 10, bbb = 1;
  
            // Displaying a, b, c
            System.out.println("Var1 = " + aaa);
            System.out.println("Var2 = " + bbb);
      
            // Using logical NOT operator
            System.out.println("!(a < b) = " + !(aaa < bbb));
            System.out.println("!(a > b) = " + !(aaa > bbb));

            //a = 10, b = 20
            //!(a<b) // returns false
            //!(a>b) // returns true


    }
    
}
