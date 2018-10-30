import java.util.*;

public class ArrayDemo 
{
  public static void main(String []args)
  {
	  int marks[] = new int[6];
	  String so[]= {"abc","def","ghi","jkl"};
	  int sum=0,i;
	  
	   Scanner s = new Scanner(System.in);
	   System.out.print("Enter the Marks");
	   for(i=0; i<6; i++)
	   {
		   marks[i] = s.nextInt();
		   sum+=marks[i];
	   }
	   
	   System.out.println("These are the following Numbers in array ");
	   
	   for(i=0; i<6; i++)
	   {
		System.out.println("marks[" +i+ "]=" +marks[i]);   
	   }
	   
	   System.out.println("These are the following Strings in array ");
	   for(i=0 ; i<4 ; i++)
	   {
	   System.out.println("so[" +i+ "]=" + so[i]);
	   }
	   
	   /*for (int element : marks)
		   
	   {
		   System.out.println(element+" ");
	   }
	   */
	   
	   System.out.println("Sum of the array elements is"+sum);
  }
}
