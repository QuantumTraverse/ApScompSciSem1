public class Toy
{
	private String name;
	private int count;
	public Toy()
	{
		this.name = "";
		this.count = 1;
	}
	public Toy(String n)
	{
		this.name = n;
		this.count = 1;
	}
	public int getCount()
	{
		return this.count;
	}
	public String getName()
	{
		return this.name;
	}
	public void setCount(int c)
	{
		this.count = c;
	}
	public void setName(String n)
	{
		this.name = n;
	}
	public abstract String getType()
	{
		
	}
	public String toString()
	{
		return name + ": " + count;
	}
}