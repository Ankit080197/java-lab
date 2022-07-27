/* write a program to find the given 
number is prime or not
@Ankit Sharma*/


class PrimeNumber
{    
   public static void main(String args[])
 {    
            int g=23,coef=0;               //it is the number to be checked
        for (int i=1;i<=g;i++)
  {
          if(g%i==0)
   {
         coef++;
   } 
  }

   if(coef == 2)
    { 
        System.out.println(g+" is a prime number");
    } 
     else      
    {
        System.out.println(g+" not prime number");
    }
 }
}