public class inventory
{
	private String manufacturer, name, category;
	private int UPC;
	private double price;
	public inventory()
	{
		manufacturer = "Null";
		name = "Null";
		category = "Null";
	}
	public inventory(String man, String nm)
	{
		manufacturer = man;
		name = nm;
		category = "Null";
		UPC = (int)(Math.random() * 10000000) + 1;
		price = 7.50;
	}
	public inventory(String man, String nm, String cat, double pr)
	{
		manufacturer = man;
		name = nm;
		category = cat;
		UPC = (int)(Math.random() * 10000000) + 1;
		price = pr;
	}
	public void setValues(String man, String nm, double pr)
	{
		manufacturer = man;
		name = nm;
		category = "Null";
		UPC = (int)(Math.random() * 10000000) + 1;
		price = pr;
	}
	public String toString()
	{
		return "Item Info...\nItem Manufacturer: " + manufacturer + "\nItem Name: " + name + "\nItem Category: " + category + "\nUPC #: " + UPC + "\nPrice: " + price;
	}
}