import java.util.*;

public class ArmstrongNumber 
{
  public static void main(String []args)
  {
    int num , temp=0 ;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number:");
    num = s.nextInt();
  
    int i=num;
    while(num>0)
     {
	  int r = num%10;
	  temp = temp + r*r*r;
	  num = num/10;
	 }
  
    if(i == temp)
     {
	   System.out.println(i+ " is an Armstrong number"); 
     }
    else 
     {
       System.out.println(i+ " is not an Armstrong number");
     }
  
  }
  
}
