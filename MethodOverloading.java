import java.util.*;

public class MethodOverloading 
{
	int num1;
	int num2;
	int num3;
	
    public MethodOverloading()
    {
    	num1=num2=num3=0;
    }
    
    public MethodOverloading(int n1,int n2,int n3)
    {
    	num1=n1;
    	num2=n2;
    	num3=n3;
    }
    
    public int add(int n1,int n2)
    {
    	return num1+num2;
    }
    
    public int add(int n1,int n2,int n3)
    {
    	return num1+num2+num3;
    }
    	
    public static void main(String []args)
    {
    	
    	MethodOverloading mo = new MethodOverloading();
    	
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter the numbers:");
    	int n1 = s.nextInt();
    	int n2 = s.nextInt();
    	int n3 = s.nextInt();
    	
    	MethodOverloading mo1 = new MethodOverloading(n1,n2,n3);
    	
    	System.out.println("Sum of the numbers is: " +mo.add(n1, n2));
    	System.out.println("Sum of the numbers is: " +mo.add(n1, n2, n3));
    	System.out.println("Sum of the numbers is: " +mo1.add(n1, n2));
    	System.out.println("Sum of the numbers is: " +mo1.add(n1, n2, n3));
    	
    	
    }
}
