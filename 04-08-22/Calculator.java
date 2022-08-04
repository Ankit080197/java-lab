/*WAP to illustrate Calculator class with add,sub,mul 
methods that can take any nO. of parameters 
to perform the operation?
@Ankit Sharma*/

import java.util.Scanner;
  class Calculator
{
  public static void main(String[] args)
 {
    char operator;
      Double num1, num2, ans;

    
  Scanner miku = new Scanner(System.in);        // create an object of Scanner class

    
     System.out.println("Choose an operator: +, -, *, or /");        // ask users to enter operator
        operator = miku.next().charAt(0);

     System.out.println("Enter first number");          // ask users to enter numbers
        num1 = miku.nextDouble();

     System.out.println("Enter second number");
        num2 = miku.nextDouble();

    switch (operator)
    {

     case '+':                          // performs addition between numbers
        ans = num1 + num2;
         System.out.println(num1 + " + " + num2 + " = " + ans);
          break;

     case '-':                          // performs subtraction between numbers
        ans = num1 - num2;
         System.out.println(num1 + " - " + num2 + " = " + ans);
          break;

     case '*':                          // performs multiplication between numbers
        ans = num1 * num2;
         System.out.println(num1 + " * " + num2 + " = " + ans);
          break;

     case '/':                          // performs division between numbers
        ans = num1 / num2;
         System.out.println(num1 + " / " + num2 + " = " + ans);
          break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    miku.close();
  }
}