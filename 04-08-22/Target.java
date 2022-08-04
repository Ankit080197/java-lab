/*WAP to Read array of int's and a target from the user and the return
 indices of the two no's such they add upto the target?
@Ankit Sharma?*/

import java.util.Scanner;          //import scanner library
    class Target                                       // main class
{
        public static void main(String args[])               //main method
	{
		Scanner miku = new Scanner(System.in);       //creating scanner object
		  System.out.println("Enter the length of array = ");
		     int LEN = miku.nextInt();                             //read the array elements here
		
		int[] arr;                          // creating an array 
		  arr = new int[LEN];
		    System.out.println("Enter "+LEN+" elements = ");	
		
		for(int i=0;i<LEN;i++)          //for loop for storing elements
		{
			arr[i]= miku.nextInt();
		}
		System.out.println("Enter the Sum of two number = ");
		int TARGET = miku.nextInt();
		search ak = new search();    // creating object for subclass 
		ak.Sum(arr,LEN,TARGET);
		miku.close();
	}
}

class search                        //sub class
{
	public void Sum(int arr[],int LEN,int TARGET)
	{
		int LENGTH = LEN;
		for(int i=0;i<LENGTH;i++)
		{
			for(int j=i+1;j<LENGTH;j++)
	       	{
				if(TARGET == arr[i]+arr[j])
				{
					System.out.print("Element: ["+arr[i]+","+arr[j]+"]");
					
				}
			}
		}
	}
}