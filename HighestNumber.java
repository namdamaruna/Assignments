/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class HighestNumber {
    public static void main(String args[])
    {
        int num1,num2,num3;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        num1=s.nextInt();
        System.out.println("Enter the second number:");
        num2=s.nextInt();
        System.out.println("Enter the third number:");
        num3=s.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("highest number is="+num1);
        }
         
        else if(num2>num3){
            System.out.println("highest number is="+num2);
        }
        else{
            System.out.println("highest number is="+num3);
        }
        
    }
     
//Add main method

//Declare the three variables

//Use the scanner class to provide input at execution time
/* 
 Scanner s= new Scanner(System.in);
 System.out.println("Enter the first number");
 number1=s.nextInt();
 
*/

//check which number is highest using if else condition

//Print the highest of three numbers
 
}