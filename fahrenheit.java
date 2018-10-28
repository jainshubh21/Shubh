import java.util.*;

class fahrenheit
{
	public static void main(String []args)
	{
		float temp;
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the Temperature in celcius:");
		temp = sobj.nextFloat();
		
		float frnt = temp*9/5 + 32;
		System.out.println("Temperature in fahrenheit is:" + frnt);
	}
	
}