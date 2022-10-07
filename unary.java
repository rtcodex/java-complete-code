//program 15

public class unary {
    public static void main(String[] args)
    {
        //Unary minus(-)
        //This operator can be used to convert a positive value to a negative one. 
        int n1 = 20;
        System.out.println("Number = " + n1);
        n1 = -n1;
        System.out.println("Result = " + n1);
        System.out.println("------------------------------------");


        // ‘NOT’ Operator(!)
        //This is used to convert true to false or vice versa.
        // Basically, it reverses the logical state of an operand.
        boolean cond = true;
        int a = 10, b = 1;
        System.out.println("Cond is: " + cond);
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Now cond is: " + !cond);
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
        System.out.println("------------------------------------");

        //Increment(++)
        //Post-increment operator
        /*When placed after the variable name, the value of the operand is incremented 
        but the previous value is retained temporarily until 
        the execution of this statement and it gets updated before 
        the execution of the next statement.*/
        //  num = 5
        //  num++ = 6

        //Pre-increment operator
        //When placed before the variable name, the operand’s value is incremented instantly.
        //   num = 5
       //  ++num = 6


       //Decrement(–)
       // Post-decrement operator
       // num = 5
       // num-- = 4

       //Pre-decrement operator
       //num = 5
       //--num = 4

       //Bitwise Complement(~)
       //This unary operator returns the one’s complement representation of the input value or operand, 
       //i.e, with all bits inverted, which means it makes every 0 to 1, and every 1 to 0. 


       int num1 = 6, num2 = -2;
       System.out.println("First Number = " + num1);
       System.out.println("Second Number = " + num2);

      System.out.println(
        num1 + "'s bitwise complement = " + ~num1);
      System.out.println(
        num2 + "'s bitwise complement = " + ~num2);
 

    }
}
