public class toyota extends car
{
	public toyota()
	{
		super();
	}
	public toyota(String xAndy)
	{
		super();
		String[] splitsplat = xAndy.split(",");
		move(Double.parseDouble(splitsplat[0]), Double.parseDouble(splitsplat[1]));
	}
}