/*write a java program to print sum of
 odd numbers upto N
@Ankit Sharma*/

import java.util.Scanner;    //import scanner library
class sumOfOddnumbers
{
   public static void main (String args[])   //main method
 {
  Scanner obj = new Scanner(System.in);         //creating an object
   System.out.println("Enter odd number till you wan't to add");    //to print user input
    int x;
     int sum = 0;
       x = obj.nextInt();
         for(int i=1;i<=x;i++)
           if(i%2!=0) 
          
            {
             sum += (i);
            }
   {
     System.out.println("the sum of the odd number is given" +sum);     //print output
   }
 
 }
} 
