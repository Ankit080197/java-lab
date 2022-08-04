import java.util.Scanner;
public class Biggest
{
    public static void main(String[] args) 
    {
        int num,biggest;
        Scanner miku = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        num = miku.nextInt();
        int a[] = new int[num];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < num; i++)
        {
            a[i] = miku.nextInt();
        }
        biggest = a[0];
        for(int i = 0; i < num; i++)
        {
            if(biggest < a[i])
            {
                biggest = a[i];
            }
        }
        System.out.println("Biggest value:"+biggest);
    }
}