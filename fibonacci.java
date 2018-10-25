class fibonacci
{
  public static void main(String args[])
  {
	  int n=0,m=1,sum=0,r[];
	  r= new int[10];
	  
	     r[0]=n;
		 r[1]=m;
	  	  for(int i=2;i<10;i++)
		  {
			  sum=r[i-2]+r[i-1];
			  r[i]=sum;
		  }
		  
		  for(int i=0;i<10;i++)
		  {
			  System.out.println("Fibonacci series is:"+r[i]);
		  }
		  
	  
  }

}
