/*write a program to find largest between three 
and four integers
@Ankit Sharma*/

class ConditionalOperator
{
public static void main (String args[])     //main method
{
int a=12, b=23, c=87, d=67, largest1,largest2; //declaring variables
largest1 = ((a>b && a>c)) ? a:(b>c ? b:c);    //comparing a,b and c
largest2 = ((a>b && a>c && a>d) ? a:(b>c && b>d)? b:(c>d) ? c:d);     //comparing a,b,c and d
System.out.println("largest1:\na:"+a+"b:"+b+"c:"+c+"\nlargest1 is:"+largest1);   //print out for a,b and c
System.out.println("largest2:\na:"+a+"b:"+b+"c:"+c+"d:"+d+"\nlargest2 is:"+largest2);   //print output for a,b,c and d
}
}