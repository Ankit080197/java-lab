/* to write the table of n numbers using java
@Ankit Sharma*/


import java.util.Scanner;                     //import scanner library                   
class table
{ 
    public static void main(String args[])       //main method                       
    {                           
        Scanner miku = new Scanner(System.in);                // creating object                                                          
        System.out.println("Enter a number for which you want to print the table");
        int x= miku.nextInt();                                     //assign integer                                                         
        int y= 10;
        for(int i=1;i<=y;i++)                    // int "i" will increment till "y"
        {
            System.out.println("table for"+x+"X" +i+ "=" +(x*i));      //to print output
           
        }
        miku.close();     //closing object                                              
     }
}