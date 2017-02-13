public class personalComputer extends gameSystem
{
	public personalComputer()
	{
		super();
	}
	public personalComputer(String p)
	{
		super(p);
	}
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	public String toString()
	{
		return "Platform: " + super.getPlatform() + "\nSerial #: " + super.getSerial() + "\nSystem Input: " + systemInput();
	}
}