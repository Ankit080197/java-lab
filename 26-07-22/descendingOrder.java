/*write a java program to print array
in descending order
@Ankit Sharma*/

import java.util.Scanner;       //import scanner library
class DescendingOrder
{
    public static void main(String args[])      //main method
    {
        int n, temp;
        Scanner miku = new Scanner(System.in);       //creating an object
        System.out.print("Enter no. of elements you want in array:");           //to print user input
        n = miku.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)           //loop for user input values
        {
            a[i] = miku.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] < a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Descending Order:");        //print output
        for (int i = 0; i < n - 1; i++)               //condition to print output
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}