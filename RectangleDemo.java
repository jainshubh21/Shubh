
public class RectangleDemo 
{
  float Length;
  float Breadth;
  
  public float getLength()
  {
	  return Length;
  }
  
  public void setLength(float l)
  {
	  this.Length = (l>0)?l:1;
  }
  
  public float getBreadth()
  {
	  return Breadth;
  }
  
  public void setBreadth(float b)
  {
	  this.Breadth = (b>0)?b:1;
  }
  
  public float CalcArea()
  {
	  return Length*Breadth;
  }
}
