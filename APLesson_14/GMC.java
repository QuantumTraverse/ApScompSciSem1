public class GMC implements location
{
	private double xcoord, ycoord;
	public GMC()
	{
	   xcoord = 0;
	   ycoord = 0;
	}
	public GMC(double x, double y)
	{
	   xcoord = 0;
	   ycoord = 0;
	   move(x,y);
	}
	public int getID()
	{
	   return (int)(Math.random() * 1000000);
	}
	   public void move(double x, double y)
	{
	   xcoord += x;
	   ycoord += y;
	}
	public double[] getLoc()
	{
	   double [] loco = new double [2];
	   loco[0] = xcoord;
	   loco[1] = ycoord;
	   return loco;
	}
}