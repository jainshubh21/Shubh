import java.util.*;

class PrimNumber
{
	public static void main(String [] args)
	{
		int p,flag=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		p = s.nextInt();
		
		for(int i=2 ; i<p/2 ; i++)			
		{
           if(p%i==0)
		   {
			System.out.println(p+"It is not a prime Number");			   
		    flag = 1;
		   }
	    }
		
		if(flag==0)
		{
			System.out.println(p+"It is a prime Number");			   
		}
	}
}