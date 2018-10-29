import java.util.*;

class agecheck
{
	public static void main(String []args)
	{
  int age;
  Scanner so = new Scanner(System.in);
  System.out.print("Enter the age:");
  age = so.nextInt();
  
  if(age>0 && age<=25)
  {
	   System.out.println("Mature");
	 /*	 if(age<=15)
	  {
		  System.out.println("Kid");
	  }
	  else
	  {
		  System.out.println("Mature");
	  }*/
  }
  else if(age>25 && age<=45)
  {
	  System.out.println("Adult");
  }
  else
  {
	  System.out.println("Old Enough");
  }

  }
}

