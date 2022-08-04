/*write a program to find second biggest 
element in array
@Ankit Sharma*/

import java.util.Scanner;
public class Sbiggest
{
  public static void main(String[] args)
 {
   int num, Sbiggest;
    Scanner miku = new Scanner(System.in);          //create object of scanner class
     System.out.print("Enter total number of elements you wants : ");       //enter total no. of elements
      num = miku.nextInt();

      int a[] = new int[num];            //creating array object

    System.out.println("Enter all the elements:");                        //enter the elements
     for (int i = 0; i < num; i++) 
    {
      a[i] = miku.nextInt();
    } 
        for (int i = 0; i < num; i++)
          {
          for (int j = i + 1; j < num; j++)
            {
             if (a[i] > a[j])
              {
               Sbiggest = a[i];
               a[i] = a[j];
               a[j] = Sbiggest;
              }
            }
          }
    System.out.println("The Second Largest Elements in the Array is :" + a[num - 2]);              //print output
  }
}