/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/



//Add main method here

//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)

//use for loop and if condition to print a,b,c 
     

public class DiamondPattern {
    public static void main(String args[])
    {
        int i,j,k,m;
        int alphabet = 97;
        for(i=0;i<=4;i++)
        {
            
            for(j=3;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=0;k<=i;k++)
            {
                System.out.print((char) (alphabet+k)+ " ");
            }
            for (m=0;m>=i;m--)
            {
                System.out.print((char) (alphabet+m)+ " ");
            }
            System.out.println();
        }
    }

//Add main method here

//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)

//use for loop and if condition to print a,b,c 
     
}