import static java.lang.Math.*;
public class Distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	public Distance(int a, int b, int c, int d)
	{
		xOne = a;
		yOne = b;
		xTwo = c;
		yTwo = d;
		distance = 0;
	}
	public void setValues(int a, int b, int c, int d)
	{
		xOne = a;
		yOne = b;
		xTwo = c;
		yTwo = d;
		distance = 0;
	}
	public double getDist()
	{
		return Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
	}
}