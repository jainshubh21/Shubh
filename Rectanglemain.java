import java.util.*;

public class Rectanglemain 
{
  public static void main(String []args)
  {
	 RectangleDemo rd = new RectangleDemo();
	 
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter the length:");
	 float l = s.nextFloat();
	 System.out.println("Enter the Breadth:");
	 float b = s.nextFloat();
	 
	 rd.setLength(l);
	 rd.setBreadth(b);
	 
	 System.out.println("Area of the rectangle is:" +rd.CalcArea());
  }
}
