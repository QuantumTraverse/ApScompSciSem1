public class toyota implements location
{
	private double xcoord, ycoord;
	public toyota()
	{
		xcoord = 0;
		ycoord = 0;
	}
	public toyota(String xAndy)
	{
		xcoord = 0;
		ycoord = 0;
		String[] splitsplat = xAndy.split(",");
		double deltaX = Double.parseDouble(splitsplat[0]);
		double deltaY = Double.parseDouble(splitsplat[1]);
		move(deltaX, deltaY);
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