import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the distance (in miles):");
		int distance = kb.nextInt();
		System.out.println("Please enter the hours:");
		int hours = kb.nextInt();
		System.out.println("Please enter the minutes:");
		int minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + object.getMPH() + " mph");

		System.out.println("Please enter the distance (in miles):");
		distance = kb.nextInt();
		System.out.println("Please enter the hours:");
		hours = kb.nextInt();
		System.out.println("Please enter the minutes:");
		minutes = kb.nextInt();
		object.setValues(distance, hours, minutes);
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + object.getMPH() + " mph");
	}
}