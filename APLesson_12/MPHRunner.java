import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the distance:")
		distance = kb.next();
		System.out.println("Please enter the hours:")
		hours = kb.next();
		System.out.println("Please enter the minutes:")
		minutes = kb.next();
		
		MilesPerHour object = new MilesPerHour();
		System.out.print(object.getDistance() + " miles in " + object2.getHours() + " hours and " + object2.getMinutes() + "\n\n");
	}
}