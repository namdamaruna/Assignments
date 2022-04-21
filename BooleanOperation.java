//JFM1T3_Assignment5:
/*
1.Write a program to initialize a boolean variable and print it's opposite value on console.

  Sample Input:true

  Expected Output:false

*/
import java.util.Scanner;

public class BooleanOperation { 
  
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter boolean:");
    boolean a=sc.nextBoolean();
    if(a!=true)
       System.out.println("output:true");
    else
       System.out.println("output:false");
  }
  
}

//Define main method

//Declare a variable and initialize it as true or false 

//Print the Result using not operator 

