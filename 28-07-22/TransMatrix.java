/*Write a java program to print transpose matrix 
from given matrix
 @Ankit Sharma*/
  
import java.util.Scanner;          //import scanner library
class TransMatrix
{
  public static void main(String args [])
  {
    int a,k;
         System.out.println("enter no. of rows and columns");
           Scanner miku = new Scanner(System.in);                  //creating an object
                 int row = miku.nextInt();
                 int col = miku.nextInt();
               int arr[][]= new int[row][col];
    System.out.println("Enter elements of matrix");          //to print user input
       for(a=0;a<row;a++)                                   
       {
         for(k=0;k<col;k++)
          {
           arr[a][k]= miku.nextInt(); 
          }
      }
   System.out.println("orginal array");      //to input user array    
       for(a=0;a<row;a++)              //loop for user input    
         {
          for(k=0;k<col;k++)
           {
            System.out.print(arr[a][k]+" ");
            }
             System.out.println(" ");
              }
    System.out.println("The transpose matrix");         //print output 
    
         for (a=0;a<col;a++)                         //conditions to print output
          {
           for(k=0;k<row;k++)
            {  
             System.out.print(arr[k][a]+" ");
             }
              System.out.println(" ");
               }
  }
}