/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String args[])
    {

//Add main method here
    int start,end,count=0;
//Declare variables num1, num2, i, count and initialize count as zero
    Scanner sc=new Scanner(System.in);
//Use the scanner class to provide input at execution time using scanner object
//Scanner s= new Scanner(System.in);
    System.out.println("enter starting number:");
    start =sc.nextInt();
    System.out.println("enter ending number:");
    end =sc.nextInt();
/*
Take start value as input and read using scanner object
System.out.print("Enter Starting Number : ");
int start = sc.nextInt();
*/  System.out.println("prime numbers between "+start+" and "+end+" are:");

//Take end value as an input and read using scanner object
    for(int i=start;i<=end;i++)
    {
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
            {
              count=0;
              break;
            }
            else{
              count=1;
            }
        }
    if(count==1)
    System.out.println(i);
    }
    }
//check for all the integer numbers which is between the two numbers given, using for loop

/*Inside the loop, check if the number can be divided by other numbers. You will need another loop for this.
  If it is divisble by other numbers (except 1 and itself), then move on to check the next number
  Else, print the prime number and then move on to the next number
*/
 
     
}