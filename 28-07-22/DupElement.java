/*write a java program to print number of duplicate
values in array
@Ankit Sharma*/

import java.util.Scanner;              //import scanner library
public class DupElement 
{    
	public static void main(String[] args) 
	{ 
        Scanner miku = new Scanner(System.in);       //creating an object
         System.out.println("Entre the length of the array");
        int len = miku.nextInt();                                    
	int [] ak = new int[len];   
         int count =0; 
        System.out.println("enter array values");        //to print users array values
          for(int i=0;i < ak.length; i++)                
            {
              ak[i]=miku.nextInt();         
 		}
       
        System.out.println("Duplicate elements in given array");    //to print user elements in given array
        for(int i = 0; i < ak.length; i++)             //condition for print output                     
	{  
            for(int j = i+1; j < ak.length; j++) 
		{  
                if(ak[i] == ak[j])  
                    ++count;  
       		} 
            } 
      System.out.println(count);        //print output
   }  
  }