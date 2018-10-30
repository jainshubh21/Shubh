import java.util.*;


public class ConstructorDemo 
{
   
	int age;
	double weight;
	double height;
	
	public ConstructorDemo()
	{
		age=22;
		weight=84.5;
		height=156.7;
	}
	
	public ConstructorDemo(int a,double w,double h)
	{
		age=a;
		weight=w;
		height=h;
	}
	
	public static void main(String []args)
	{
	  ConstructorDemo cd = new ConstructorDemo();
	  ConstructorDemo cd1 = new ConstructorDemo(21,89,156.3);
	  
	  System.out.println("Age is:" +cd.age);
	  System.out.println("Weight is:" +cd.weight);
	  System.out.println("Height is:" +cd.height);

	  System.out.println("Age is:" +cd1.age);
	  System.out.println("Weight is:" +cd1.weight);
	  System.out.println("Height is:" +cd1.height);
	  
	  
	}
	
	
	
}
