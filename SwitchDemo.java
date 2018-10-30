
import java.util.*;
import java.util.Date;

class SwitchDemo
{
	public static void main(String []args)
	{
	/*int day;
	Date d = new Date();
	System.out.println(d);
	day = d.getDay();*/
	
	/*Scanner s = new Scanner(System.in);
	System.out.println("Enter the Day:");
	int day = s.nextInt();*/
		
	/*Scanner s = new Scanner(System.in);
	System.out.println("Enter the month");
	String month = s.next();
	
	switch(month)
	{
		 case "January" :
		 case "january" :
		   System.out.println("January 2018");
		   break;
		 case "February" :
		 case "february" :
		   System.out.println("February 2018");
		   break;
	     case "March" :
	     case "march" :
		   System.out.println("March 2018");
		   break;
         case "April" :
         case "april" :
		   System.out.println("April 2018");
		   break;
	     case "May" :
	     case "may" :
		   System.out.println("May 2018");
		   break;
	     case "June" :
	     case "june" :
		   System.out.println("June 2018");
		   break;
	     case "July" :
	     case "july" :
		   System.out.println("July 2018");
		   break;
	     case "August" :
	     case "august" :
		   System.out.println("August 2018");
		   break;
	     case "September" :
	     case "september" :
		   System.out.println("September 2018");
		   break;
	     case "October" :
	     case "october" :
		   System.out.println("October 2018");
		   break;
	     case "November" :
	     case "november" :
		   System.out.println("November 2018");
		   break;
	     case "December" :
	     case "december" :	 
		   System.out.println("December 2018");
		   break;
	    
		 default:
		   System.out.println("ENter any of the month from Jan-Dec");
		   
	}*/
		
		char ch;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter a Character:");

		ch=s.next().charAt(0);

		switch(ch)
		{
			case 'A':
			case 'a':
				System.out.println("Vowel");
				break;
			case 'E':
			case 'e':
				System.out.println("Vowel");
				break;
			case 'I':
			case 'i':
				System.out.println("Vowel");
				break;
			case 'O':
			case 'o':
				System.out.println("Vowel");
				break;
			case 'U':
			case 'u':
				System.out.println("Vowel");
				break;
			
			default:
				System.out.println("Consonant");
		}

	}	
	
} 