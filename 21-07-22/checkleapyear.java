 /* to find the leap year between 
two years
@Ankit Sharma */

class CheckLeapYear
{
         public static void main(String args[])   //main method
 {
     int i;     //declaring variable
        for(i=1947;i<=2022;i++)
  {
        if(i%4==0)
   {
        System.out.println(i+"It is a Leap Year");   //print output
   }
  }
 }
}