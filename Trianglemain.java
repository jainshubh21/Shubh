import java.util.*;

public class Trianglemain 
{
  public static void main(String []args)
  {
	  TriangleDemo tr = new TriangleDemo();
	  
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the Base:");
	  double b = s.nextFloat();
	  System.out.println("Enter the Height:");
	  double h = s.nextFloat();
	  
	  tr.setBase(b);
	  tr.setHeight(h);
	  
	  System.out.println("Area of the Triangle id:" + tr.CalcArea());
  }
}
