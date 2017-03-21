public class car implements location
{
	private double[] coords;
	public final int ID = (int)(Math.random() * 1000000);
	public car()
	{
		coords = new double [2];
	}
	public int getID()
	{
	   return ID;
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