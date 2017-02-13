public class ticket
{
	private double price;
	private int serialNo;
	public ticket()
	{
		platform = "ERROR";
		serialNo = (int)(Math.random() * 10000000);
	}
	public int getSerial()
	{
		return serialNo;
	}
	public abstract double getPrice();
	public String toString()
	{
		return "Serial #: " + getSerial() + "\nPrice: " + getPrice();
	}
}