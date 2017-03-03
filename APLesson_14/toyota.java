public class toyota implements location
{
	private double[] coords;
	public toyota()
	{
		coords = new double [2];
	}
	public toyota(String xAndy)
	{
		coords = new double [2];
		String[] splitsplat = xAndy.split(",");
		move(Double.parseDouble(splitsplat[0]), Double.parseDouble(splitsplat[1]));
	}
	public int getID()
	{
	   return (int)(Math.random() * 1000000);
	}
	public void move(double x, double y)
	{
		coords[0] += x;
		coords[1] += y;
	}
	public double[] getLoc()
	{
		double [] loco = coords;
		return loco;
	}
}