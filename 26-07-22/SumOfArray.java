import java.util.Scanner;
public class SumOfArray
{
  public static void main(String[] args) 
   {
    int num, sum = 0;
     Scanner miku = new Scanner(System.in);
      System.out.print("Enter no. of elements you want in array:");
       num = miku.nextInt();
        int a[] = new int[num];
     System.out.println("Enter all the elements:");
      for(int i = 0; i < num; i++)
        {
           a[i] = miku.nextInt();
           sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
    }
}