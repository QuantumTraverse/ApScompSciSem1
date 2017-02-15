public class ticketDriver
{
	public static void main(String[]args)
	{
		advance bob = new advance();
		advance nancy = new advance(11);
		studentAdvance sally = new studentAdvance();
		walkUp joe = new walkUp();
		
		System.out.println(bob);
		System.out.println(nancy);
		System.out.println(sally);
		System.out.println(joe);
	}
}