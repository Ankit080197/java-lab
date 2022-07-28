/*write a program to create customer class using 
given variables
@Ankit sharma*/

import java.util.Scanner;       //import scanner library
class bankAcc   
{
  public static void main(String args[])       //main method
   { 
      int Amt=30000,AccNum=135792468,AccBal=99999;         
           String AccName="raavan";
	 
       customer miku = new customer();                              //creating object 
       miku.setAccInfo(AccNum,AccName,AccBal); 
       miku.getamt();   
	 	 
       miku.depositamt(Amt);
       miku.getamt();
       miku.withdrawamt(Amt);
       miku.getamt();
   }
}
 class customer
 { 
     private int AccNum, AccBal;           //declaring variables for customer
     private String AccName;

      public void setAccInfo(int accountNumber,String accountName,int accountBalance)      //add customer detail
    {  
	  AccNum=accountNumber;
	  AccName=accountName;
	  AccBal=accountBalance;
	
	}
     
	public void depositamt(int Amt)                //method to deposit money
        {
         System.out.println("deposit Amt is "+Amt);
	 AccBal+=Amt;  	
	}
	public void withdrawamt(int Amt)
      {
        System.out.println("withrawamt is"+Amt);
         AccBal -= Amt; 
        }
        public void getamt()
{
        System.out.println("Hello!" +AccName+ " you're Welcome , " + "your account number is "+AccNum+ " and balance is Rs."+AccBal);     //print output
 }
} 
 