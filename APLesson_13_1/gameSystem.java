public class gameSystem
{
	private String platform;
	private int serialNo;
	public gameSystem()
	{
		platform = "ERROR";
		serialNo = (int)(Math.random() * 10000000);
	}
	public gameSystem(String p)
	{
		platform = p;
		serialNo = (int)(Math.random() * 10000000);
	}
	public String getPlatform()
	{
		return platform;
	}
	public int getSerial()
	{
		return serialNo;
	}
}