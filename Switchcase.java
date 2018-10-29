import java.util.*;
import java.util.Date;

class SwitchCase
{
	public static void main(String []args)
	{
	/*int day;
	Date d = new Date();
	System.out.println(d);
	day = d.getDay();*/
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Day:");
	int day = s.nextInt();
	
	switch(day)
	{
		 case 0 :
		   System.out.println("Sunday");
		   break;
		 case 1 :
		   System.out.println("Monday");
		   break;
	     case 2 :
		   System.out.println("Tuesday");
		   break;
         case 3 :
		   System.out.println("Wednesday");
		   break;
	     case 4 :
		   System.out.println("Thursday");
		   break;
	     case 5 :
		   System.out.println("Friday");
		   break;
	     case 6 :
		   System.out.println("Saturday");
		   break;
	     
		 default:
		   System.out.println("ENter the value in between 0-6");
	}
	
	}	
	
} 