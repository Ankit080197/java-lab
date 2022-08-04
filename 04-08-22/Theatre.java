/*Create a theatre class and movie class in which we can add movie 
details and print the all details of the movie?
@Ankit Sharma*/

import java.util.Scanner;           // importing scanner library

class Theatre          //main class
{
	
public static void main(String args[])
     { 
       Scanner miku = new Scanner(System.in);         //creating scanner object
	   System.out.println("ENTER MOVIE NAME : ");
	       String mName = miku.nextLine();
	   System.out.println("ENTER MOVIE START TIME :");
	       int sTime = miku.nextInt();
	   System.out.println("Enter MOVIE END TIME : ");
	       int eTime = miku.nextInt();
	   System.out.println("Enter MOVIE TICKET PRICE : ");
	       int price = miku.nextInt();
	 
         movie screening = new movie();              //creating an object screening
	  System.out.println("Choose the operation from following option :");
	   System.out.println("to add details enter   : ADD \n to print details enter : PRINT");
	    String option = miku.next();
	     switch(option)         //using switch for selecting operation       
              { 
		case "add": screening.addDetail(mName,sTime,eTime,price);     //call adddetail method
		break;
		
	        case "print": screening.printDetail(mName,sTime,eTime,price);     //call printdetail method
		break;
		
	        default : System.out.println("Invalid Selection!");
	      }
	  miku.close();
       }
 }

  class movie                  //subclass
     {
	String NE;                     //creating variable
	int ST,ED,PE;
	
	public void addDetail(String name,int start,int end,int price)        //creating method adddetail to add movie detail
        {
		NE= name;
		ST = start;
		ED = end;
		PE = price;	
		System.out.println("Movie details successfully added.");
	}
	
	
	     public void printDetail(String movieName,int startTime,int endTime,int price)           //creating method printdetail to print movie details
             {
		System.out.println("  TICKET  ");
		System.out.println("MOVIE  NAME  : "+movieName);
		System.out.println("Screen Time  : "+startTime+" - "+endTime+" ");
		System.out.println("TICKET PRICE : Rs."+price+" ");
	    }
    }