import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the first x-coordinate:");
		int x1 = kb.nextInt();
		System.out.println("Please enter the first y-coordinate:");
		int y1 = kb.nextInt();
		System.out.println("Please enter the second x-coordinate:");
		int x2 = kb.nextInt();
		System.out.println("Please enter the second y-coordinate:");
		int y2 = kb.nextInt();
		
		Distance object = new Distance(x1, y1, x2, y2);
		System.out.printf("Distance = %.2f", object.getDist());

		System.out.println("\nPlease enter the distance (in miles):");
		System.out.println("Please enter the first x-coordinate:");
		x1 = kb.nextInt();
		System.out.println("Please enter the first y-coordinate:");
		y1 = kb.nextInt();
		System.out.println("Please enter the second x-coordinate:");
		x2 = kb.nextInt();
		System.out.println("Please enter the second y-coordinate:");
		y2 = kb.nextInt();
		object.setValues(x1, y1, x2, y2);
		System.out.printf("Distance = %.2f", object.getDist());
	}
}