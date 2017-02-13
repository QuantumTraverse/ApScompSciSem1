public abstract class advance extends ticket
{
	private int daysLeft;
	public advance()
	{
		super();
	}
	public advance(String p)
	{
		super(p);
	}
	public double getPrice(int daysLeft);
	{
		if(daysLeft >= 10)
			return 30.00;
		else return 40.00;
	}
	public String toString()
	{
		return super.toString();
	}
}