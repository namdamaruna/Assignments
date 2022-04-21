/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {
    public static void main(String args[])
    {
        int add,substract,multiply,inc, dec;
        float division, remainder;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        
        add=a+b;
        substract=a-b;
        multiply=a*b;
        division=(float) a/b;
        remainder=(float) a%b;
        inc=a++;
        dec=a--;
        
        System.out.println("sum="+add);
        System.out.println("difference="+substract);
        System.out.println("multiplication="+multiply);
        System.out.println("division="+division);
        System.out.println("remainder="+remainder);
        System.out.println("increment="+inc);
        System.out.println("decrement="+dec);
        
        
    }
    

//main method

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//calculate difference,product,division,increment and remainder 

//print appropriate result for all operations

}