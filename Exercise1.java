/* Write a program to check whether a number is positive or negative
Test Data 1: x=31
Expected Output: Number is positive
Test Data 2: x=-31
Expected Output: Number is negative
*/
import java.util.Scanner;
class Exercise1 {

	public static void main(String args[]) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		num=sc.nextInt();
		
		if(num >=0){
			System.out.println("number is positive");
		}
		else{
			System.out.println("number is negative");
		}
		


	}

}