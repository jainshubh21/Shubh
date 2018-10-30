import java.util.*;

public class Circlemain 
{
	public static void main(String []args)
	{
  CircleDemo cr = new CircleDemo();
  
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the radius:");
  double r = s.nextDouble();
  
  cr.setRadius(r);
  
  System.out.println("Area of the circle i:" + cr.CalcArea());
  
	}
}
