public class ticketDriver
{
	public static void main(String[]args)
	{
		xBox xOne = new xBox("XBox One");
		xBox x360 = new xBox("XBox-360");
		playStation ps2 = new playStation("PS2");
		playStation ps3 = new playStation("PS3");
		playStation ps4 = new playStation("PS4");
		personalComputer watson = new personalComputer("Watson");
		personalComputer hal9k = new personalComputer("HAL 9000");
		
		System.out.println(xOne);
		System.out.println(x360);
		System.out.println(ps2);
	}
}